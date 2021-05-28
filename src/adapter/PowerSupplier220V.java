package adapter;

//Client
public class PowerSupplier220V {
    public void supply(E220V appliance){
        System.out.println("220V 전원 공급");
        appliance.powerOn();
    }
}
