import java.util.Scanner;

public class Ch3P34ClassLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入一個整數");
        String text = scanner.nextLine();
        int number = Integer.parseInt(text);
        System.out.println("您輸入的數字是：" + number);
    }
}
