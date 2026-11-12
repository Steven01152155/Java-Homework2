public class Ch3P47ClassTypeArgument {
    public static void main(String[] args) {
        Car car = new Car();
        int number = 1234;
        double gasoline = 20.5;
        String name = "1號車";

        car.setCar(number, gasoline);
        car.setName(name);
        car.show();
    }

    static class Car {
        private int number;
        private double gas;
        private String name = "沒有名稱";

        public void setCar(int number, double gas) {
            this.number = number;
            this.gas = gas;
            System.out.println("將車號設為" + number + "，汽油量設為" + gas);
        }

        public void setName(String name) {
            this.name = name;
            System.out.println("將車名設為" + name);
        }

        public void show() {
            System.out.println("車號是" + number);
            System.out.println("汽油量是" + gas);
            System.out.println("車名是" + name);
        }
    }
}
