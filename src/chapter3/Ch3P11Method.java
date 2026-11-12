public class Ch3P11Method {
    public static void main(String[] args) {
        Car car = new Car();
        car.number = 1234;
        car.gas = 20.5;
        car.show();
        car.show();
    }

    static class Car {
        int number;
        double gas;

        void show() {
            System.out.println("車號是" + number);
            System.out.println("汽油量是" + gas);
        }
    }
}
