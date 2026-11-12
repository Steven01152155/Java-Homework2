import java.lang.reflect.Array;

public class Ch2P40ReflectArray {
    public static void main(String[] args) {
        int[] numbers = (int[]) Array.newInstance(int.class, 3);

        Array.set(numbers, 0, 123);
        Array.set(numbers, 1, 456);
        Array.set(numbers, 2, 789);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + Array.get(numbers, i));
        }
    }
}
