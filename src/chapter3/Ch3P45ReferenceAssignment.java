public class Ch3P45ReferenceAssignment {
    public static void main(String[] args) {
        System.out.println("宣告firstCar");
        Car firstCar = new Car();
        firstCar.setCar(1234, 20.5);

        System.out.println("宣告secondCar並指定firstCar的參考");
        Car secondCar = firstCar;
        firstCar.show("firstCar");
        secondCar.show("secondCar");

        System.out.println("改變firstCar的資料");
        firstCar.setCar(2345, 30.5);
        firstCar.show("firstCar");
        secondCar.show("secondCar");
    }

    static class Car {
        private int number;
        private double gas;

        public void setCar(int number, double gas) {
            this.number = number;
            this.gas = gas;
        }

        public void show(String label) {
            System.out.println(label + "的車號是" + number);
            System.out.println(label + "的汽油量是" + gas);
        }
    }
}
