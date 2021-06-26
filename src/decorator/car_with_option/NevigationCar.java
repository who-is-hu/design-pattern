package decorator.car_with_option;

import decorator.Car;
import decorator.CarDecorator;

public class NevigationCar extends CarDecorator {
    public NevigationCar(Car car) {
        super(car);
    }

    @Override
    public int cost() {
        return super.cost() + 500;
    }

    @Override
    public String getOption() {
        return super.getOption() + "- nevigation\n";
    }
}
