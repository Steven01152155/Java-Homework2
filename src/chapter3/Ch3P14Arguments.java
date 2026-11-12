public class Ch3P14Arguments {
    public static void main(String[] args) {
        Car car = new Car();
        car.setNumber(1234);
        car.setGas(20.5);
    }

    static class Car {
        int number;
        double gas;

        void setNumber(int value) {
            number = value;
            System.out.println("將車號設為" + number);
        }

        void setGas(double value) {
            gas = value;
            System.out.println("將汽油量設為" + gas);
        }
    }
}
