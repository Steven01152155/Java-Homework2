public class Ch3P31StaticMembers {
    public static void main(String[] args) {
        Car.showCount();

        Car firstCar = new Car();
        firstCar.setCar(1234, 20.5);
        Car.showCount();

        Car secondCar = new Car();
        secondCar.setCar(4567, 30.5);
        Car.showCount();
    }

    static class Car {
        private static int count = 0;
        private int number;
        private double gas;

        public Car() {
            count++;
            System.out.println("生產了車子");
        }

        public void setCar(int number, double gas) {
            this.number = number;
            this.gas = gas;
            System.out.println("將車號設為" + number + "，汽油量設為" + gas);
        }

        public static void showCount() {
            System.out.println("車子總共有" + count + "台");
        }
    }
}
