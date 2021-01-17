package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    private static final int SERVER_PORT = 8080;
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;

//    public Client(String address, int port) {
//        try {
//            socket = new Socket(address, port);
//            System.out.println("Connected");
//
//            input = new DataInputStream(System.in);
//
//            out = new DataOutputStream(socket.getOutputStream());
//        } catch (UnknownHostException u) {
//            System.out.println(u);
//        } catch (IOException i) {
//            System.out.println(i);
//        }
//
//        String line = "";
//
//        while (!line.equals("=")) {
//            try {
//                line = input.readLine();
//                out.writeUTF(line);
//            } catch (IOException i) {
//                System.out.println(i);
//            }
//        }
//
//        try {
//            input.close();
//            out.close();
//            socket.close();
//        } catch (IOException i) {
//            System.out.println(i);
//        }
//    }

//    public static void main(String args[]) throws IOException {
//        InetAddress ip = InetAddress.getLocalHost();
//        int port = 8080;
//        Scanner sc = new Scanner(System.in);
//
//        Socket s = new Socket(ip, port);
//
//        DataInputStream dis = new DataInputStream(s.getInputStream());
//        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
//
//        while (true)
//        {
//
//            System.out.print("Enter the equation in the form: ");
//            System.out.println("'operand operator operand'");
//
//            String inp = sc.nextLine();
//
//            if (inp.equals("bye"))
//                break;
//
//            dos.writeUTF(inp);
//
//            String ans = dis.readUTF();
//            System.out.println("Answer=" + ans);
//        }
//    }
}
