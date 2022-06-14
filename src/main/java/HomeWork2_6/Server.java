package HomeWork2_6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    Socket socket;
    DataInputStream in;
    DataOutputStream out;

    public void start() {

        // Подключение
        try {
            ServerSocket serverSocket = new ServerSocket(8166);
            System.out.println("Сервер запущен, ожидаем подключения...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            InputStream inputStream = socket.getInputStream();
            in = new DataInputStream(inputStream);
            OutputStream outputStream = socket.getOutputStream();
            out = new DataOutputStream(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Отдельный поток на прием сообщений
        new Thread(() -> {
            try {
                String message;
                while (true) {
                    message = in.readUTF();
                    if (message.equals("/end")) {
                        System.out.println("Клиент отключился");
                        break; // прерывает цикл, и как следствие, поток
                    }
                    System.out.println("Сообщение от клиента: " + message);
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }).start();

       // Поток на ввод сообщений
       try {
           Scanner s = new Scanner(System.in);
           String messageOut;
           while (true) {
               messageOut = s.nextLine();
               out.writeUTF(messageOut);
               if (messageOut.equals("/end")) {
                   break;
               }
               System.out.println("Сообщение от сервера: " + messageOut);
           }
       } catch (Exception e){
           e.printStackTrace();
       } finally {
           closing();
       }
    }
    public void closing(){
        if(socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
