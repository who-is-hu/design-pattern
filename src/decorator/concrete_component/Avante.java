package decorator.concrete_component;

import decorator.Car;

public class Avante implements Car {
    @Override
    public int cost() {
        return 2000;
    }

    @Override
    public String getOption() {
        return "";
    }

    @Override
    public void drive() {
        System.out.println("drive avante");
    }
}
