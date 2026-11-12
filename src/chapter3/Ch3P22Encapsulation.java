public class Ch3P22Encapsulation {
    public static void main(String[] args) {
        Car car = new Car();
        car.setNumberAndGas(1234, 20.5);
        car.show();

        System.out.println("指定不正確的汽油量(-10.0)看看");
        car.setNumberAndGas(1234, -10.0);
        car.show();
    }

    static class Car {
        private int number;
        private double gas;

        public void setNumberAndGas(int number, double gas) {
            if (gas > 0.0 && gas < 100.0) {
                this.number = number;
                this.gas = gas;
                System.out.println("車號設為" + number + "，汽油量設為" + gas);
            } else {
                System.out.println(gas + "不是正確的汽油量");
                System.out.println("無法變更汽油量");
            }
        }

        public void show() {
            System.out.println("車號是" + number);
            System.out.println("汽油量是" + gas);
        }
    }
}
