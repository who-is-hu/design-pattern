package adapter;

public class Main {
    public static void main(String[] args) {
        PowerSupplier220V powerSupplier = new PowerSupplier220V();
        E12V pc = new PC();
        // powerSupplier.supply(pc);

        E220V adapter = new Adapter(pc);
        powerSupplier.supply(adapter);
    }
}
