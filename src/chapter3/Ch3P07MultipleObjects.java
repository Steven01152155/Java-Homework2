public class Ch3P07MultipleObjects {
    public static void main(String[] args) {
        Car firstCar = new Car();
        firstCar.number = 1234;
        firstCar.gas = 20.5;

        Car secondCar = new Car();
        secondCar.number = 2345;
        secondCar.gas = 30.5;

        System.out.println("firstCar車號是" + firstCar.number);
        System.out.println("firstCar汽油量是" + firstCar.gas);
        System.out.println("secondCar車號是" + secondCar.number);
        System.out.println("secondCar汽油量是" + secondCar.gas);
    }

    static class Car {
        int number;
        double gas;
    }
}
