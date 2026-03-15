package static2.ex;

import java.util.ArrayList;

public class Car {
    private String name;
    private static int total;

    public Car(String name) {
        this.name = name;
        System.out.println("차량구입, 이름: " + name);
        total++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + total);
    }
}
