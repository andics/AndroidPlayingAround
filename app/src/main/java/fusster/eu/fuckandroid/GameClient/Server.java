package fusster.eu.fuckandroid.GameClient;
import java.io.*;
import java.net.*;

public class Server {

    static DatagramSocket clientSocket;

    static byte[] sendData = new byte[1024];
    static byte[] receiveData = new byte[1024];

    private static int port;
    private static InetAddress ip;

    public static void connect(InetAddress ip, int port){
        try {
            Server.ip = ip;
            Server.port = port;

            clientSocket = new DatagramSocket();

            send("reg:" + Utils.name);

            new Thread(new Runnable() {
                public void run() {
                    recieve();
                }
            }).start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void connectLocal(int port) {
        try {
            connect(InetAddress.getByName("localhost"), port);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static void send(String str) {
        try {
            sendData = str.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData,
                    sendData.length, ip, port);
            clientSocket.send(sendPacket);
            Utils.append("Sended: " + str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void recieve() {
            while (true)
                try {
                    DatagramPacket receivePacket = new DatagramPacket(receiveData,
                            receiveData.length);
                    clientSocket.receive(receivePacket);
                    String fromServer = new String(receivePacket.getData()).trim();

                    Utils.append("[RECIVED] " + fromServer);

                    if (fromServer.startsWith("reg:") && fromServer.length() > 4) {
                        String[] firstSplit = fromServer.split(":");
                        //   Utils.add(firstSplit[1].split(","));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

    }
}