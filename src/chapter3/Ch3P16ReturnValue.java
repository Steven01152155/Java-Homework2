public class Ch3P16ReturnValue {
    public static void main(String[] args) {
        int value = 7;
        int result = square(value);
        System.out.println(value + "的平方是" + result);
    }

    static int square(int number) {
        return number * number;
    }
}
