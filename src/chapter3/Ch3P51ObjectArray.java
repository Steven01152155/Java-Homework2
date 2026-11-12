public class Ch3P51ObjectArray {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
        }

        cars[0].setCar(1234, 20.5);
        cars[1].setCar(2345, 30.5);
        cars[2].setCar(3456, 40.5);

        for (Car car : cars) {
            car.show();
        }
    }

    static class Car {
        private int number;
        private double gas;

        public Car() {
            System.out.println("生產了車子");
        }

        public void setCar(int number, double gas) {
            this.number = number;
            this.gas = gas;
            System.out.println("將車號設為" + number + "，汽油量設為" + gas);
        }

        public void show() {
            System.out.println("車號是" + number);
            System.out.println("汽油量是" + gas);
        }
    }
}
