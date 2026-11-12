import java.util.Scanner;

public class Ch3P43MathMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入兩個整數");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int maximum = Math.max(first, second);
        System.out.println(first + "與" + second + "中較大的是" + maximum);
    }
}
