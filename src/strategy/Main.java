package strategy;

public class Main {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        EncodingStrategy base64Strategy = new Base64Strategy();
        NormalStrategy normalStrategy = new NormalStrategy();

        String message = "hello, world";

        encoder.setEncodingStrategy(base64Strategy);
        String base64String = encoder.getMessage(message);
        System.out.println("base64String = " + base64String);

        encoder.setEncodingStrategy(normalStrategy);
        String normalString = encoder.getMessage(message);
        System.out.println("normalString = " + normalString);
    }
}
