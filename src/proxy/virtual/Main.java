package proxy.virtual;

public class Main {
    public static void main(String[] args) {
        ProxyData proxyData = new ProxyData("info1");
        proxyData.showInfo();

        // 원하는 시점에 로딩테
        proxyData.getBigData().showInfo();
    }
}
