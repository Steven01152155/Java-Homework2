public class Ch3P26Constructor {
    public static void main(String[] args) {
        Car car = new Car();
        car.show();
    }

    static class Car {
        private int number;
        private double gas;

        public Car() {
            number = 0;
            gas = 0.0;
            System.out.println("生產了車子");
        }

        public void show() {
            System.out.println("車號是" + number);
            System.out.println("汽油量是" + gas);
        }
    }
}
