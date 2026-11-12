public class Ch3P17ReturnValues {
    public static void main(String[] args) {
        Car car = new Car();
        car.setNumberAndGas(1234, 20.5);

        int number = car.getNumber();
        double gasoline = car.getGas();
        System.out.println("調查樣品車時得知");
        System.out.println("車號是" + number + "，汽油量是" + gasoline);
    }

    static class Car {
        int number;
        double gas;

        int getNumber() {
            System.out.println("調查車號");
            return number;
        }

        double getGas() {
            System.out.println("調查汽油量");
            return gas;
        }

        void setNumberAndGas(int number, double gas) {
            this.number = number;
            this.gas = gas;
            System.out.println("將車號設為" + number + "，汽油量設為" + gas);
        }
    }
}
