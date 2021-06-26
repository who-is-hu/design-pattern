package decorator.concrete_component;

import decorator.Car;

public class Sportage implements Car {
    @Override
    public int cost() {
        return 2500;
    }

    @Override
    public String getOption() {
        return "";
    }

    @Override
    public void drive() {
        System.out.println("drive sportage");
    }
}
