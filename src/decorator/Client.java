package decorator;

import decorator.car_with_option.AudioCar;
import decorator.car_with_option.NevigationCar;
import decorator.concrete_component.Sportage;

public class Client {

    public static void main(String[] args) {
        // 깡통 스포티지
        Car car = new Sportage();
        System.out.println("스포티지 옵션 : ");
        System.out.println(car.getOption());
        System.out.println("스포티지 가격 : " + car.cost());

        System.out.println("//////////////////////");
        // 네비게이션 기능 확장
        car = new NevigationCar(car);
        System.out.println("스포티지 옵션 : ");
        System.out.println(car.getOption());
        System.out.println("스포티지 가격 : " + car.cost());

        System.out.println("//////////////////////");
        // 오디오 기능 확장
        car = new AudioCar(car);
        System.out.println("스포티지 옵션 : ");
        System.out.println(car.getOption());
        System.out.println("스포티지 가격 : " + car.cost());

        car.drive();
    }
}
