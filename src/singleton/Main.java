package singleton;

public class Main {
    public static void main(String[] args) {
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aSocket = aClazz.getSocketClient();
        SocketClient bSocket = bClazz.getSocketClient();

        System.out.println("aSocket == bSocket ? " + aSocket.equals(bSocket));
    }
}
