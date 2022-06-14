package HomeWork2_6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public static void main(String[] args) {
        Client client = new Client();
        client.openConnection();

    }

    private void openConnection() {
        try {
            socket = new Socket("localhost", 8166);
            new Thread(() -> {
                try {
                    while (true) {
                        in = new DataInputStream(socket.getInputStream());
                        String messageIn = in.readUTF();
                        System.out.println("Сообщение от сервера: " + messageIn);
                        if (messageIn.equals("/end")) {
                            System.out.println("Сервер отключился");
                            break;
                        }
                    }
                    closing();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }).start();

            while (true) {
                Scanner s = new Scanner(System.in);
                String messageOut = s.nextLine();
                System.out.println("Сообщение от клиента: " + messageOut);
                out = new DataOutputStream(socket.getOutputStream());
                out.writeUTF(messageOut);
                if (messageOut.equals("/end")) {
                    break;
                }
            }
            closing();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void closing(){
        try {
            if (socket != null) {
                socket.close();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        try {
            if (in != null) {
                in.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            if(out != null){
                out.close();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
