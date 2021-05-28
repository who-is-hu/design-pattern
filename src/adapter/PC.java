package adapter;

// Adaptee
public class PC implements E12V {
    @Override
    public void powerOn() {
        System.out.println("12v pc power on");
    }
}
