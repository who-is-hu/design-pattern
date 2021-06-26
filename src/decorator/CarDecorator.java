package decorator;

public abstract class CarDecorator implements Car {
    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public int cost() {
        return car.cost();
    }

    @Override
    public String getOption() {
        return car.getOption();
    }

    @Override
    public void drive(){
        car.drive();
    };
}
