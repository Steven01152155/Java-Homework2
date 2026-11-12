import java.util.Scanner;

public class Ch2P10IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入整數");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("輸入的是1");
        } else {
            System.out.println("選擇的是1以外的數字");
        }
    }
}
