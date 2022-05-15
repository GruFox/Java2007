package HomeWork2_6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void start() {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try (ServerSocket serverSocket = new ServerSocket(8188)) {
                    System.out.println("Сервер запущен, ожидаем подключения");
                    Socket socket = serverSocket.accept();
                    System.out.println("Клиент подключился");

                    DataInputStream in = new DataInputStream(socket.getInputStream());
                    DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                    Scanner scanner = new Scanner(System.in);
                    while (true) {

                        String message = in.readUTF();
                        System.out.println("Сообщение от клиента: " + message);
                        if ("/end".equalsIgnoreCase(message)) {
                            out.writeUTF("/end");
                            break;
                        }

                        String msg = scanner.nextLine();
                        out.writeUTF(msg);
                        System.out.println("Сообщение от сервера: " + msg);
                        if ("/end".equalsIgnoreCase(msg)) {
                            break;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        });
    }
}