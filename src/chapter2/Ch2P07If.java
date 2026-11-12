import java.util.Scanner;

public class Ch2P07If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入整數");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("輸入的是1");
            System.out.println("選擇的是1");
        }

        System.out.println("結束處理");
    }
}
