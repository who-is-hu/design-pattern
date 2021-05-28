package adapter;

public class Adapter implements E220V {
    private E12V appliance;

    public Adapter(E12V appliance){
        this.appliance = appliance;
    }

    @Override
    public void powerOn() {
        System.out.println("전압 조절");
        this.appliance.powerOn();
    }
}
