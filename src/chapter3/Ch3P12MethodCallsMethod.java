public class Ch3P12MethodCallsMethod {
    public static void main(String[] args) {
        Car car = new Car();
        car.number = 1234;
        car.gas = 20.5;
        car.showCar();
    }

    static class Car {
        int number;
        double gas;

        void show() {
            System.out.println("車號是" + this.number);
            System.out.println("汽油量是" + this.gas);
        }

        void showCar() {
            System.out.println("開始顯示車子資料");
            this.show();
        }
    }
}
