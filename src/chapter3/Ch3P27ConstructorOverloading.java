public class Ch3P27ConstructorOverloading {
    public static void main(String[] args) {
        Car firstCar = new Car();
        firstCar.show();

        Car secondCar = new Car(1234, 25.0);
        secondCar.show();
    }

    static class Car {
        private int number;
        private double gas;

        public Car() {
            number = 0;
            gas = 0.0;
            System.out.println("生產了車子");
        }

        public Car(int number, double gas) {
            this.number = number;
            this.gas = gas;
            System.out.println("生產了車號為" + number + "、汽油量為" + gas + "的車子");
        }

        public void show() {
            System.out.println("車號是" + number);
            System.out.println("汽油量是" + gas);
        }
    }
}
