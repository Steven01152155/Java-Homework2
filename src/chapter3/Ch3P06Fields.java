public class Ch3P06Fields {
    public static void main(String[] args) {
        Car car = new Car();
        car.number = 1234;
        car.gas = 20.5;

        System.out.println("車號是" + car.number);
        System.out.println("汽油量是" + car.gas);
    }

    static class Car {
        int number;
        double gas;
    }
}
