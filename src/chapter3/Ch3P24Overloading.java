public class Ch3P24Overloading {
    public static void main(String[] args) {
        Car car = new Car();

        car.setCar(1234, 20.5);
        car.show();

        System.out.println("只變更車號");
        car.setCar(2345);
        car.show();

        System.out.println("只變更汽油量");
        car.setCar(30.5);
        car.show();
    }

    static class Car {
        private int number;
        private double gas;

        public void setCar(int number) {
            this.number = number;
            System.out.println("將車號設為" + number);
        }

        public void setCar(double gas) {
            this.gas = gas;
            System.out.println("將汽油量設為" + gas);
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
