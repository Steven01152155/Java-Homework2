public class Ch3P05NewObject {
    public static void main(String[] args) {
        Car car;
        car = new Car();
        System.out.println("已建立Car物件：" + car.getClass().getSimpleName());
    }

    static class Car {
    }
}
