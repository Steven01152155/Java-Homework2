public class Ch3P15MultipleArguments {
    public static void main(String[] args) {
        Car car = new Car();
        int number = 1234;
        double gasoline = 20.5;
        car.setNumberAndGas(number, gasoline);
    }

    static class Car {
        int number;
        double gas;

        void setNumberAndGas(int number, double gas) {
            this.number = number;
            this.gas = gas;
            System.out.println("將車號設為" + this.number + "，汽油量設為" + this.gas);
        }
    }
}
