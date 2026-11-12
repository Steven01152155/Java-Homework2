import java.util.Scanner;

public class Ch2P14Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入整數");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("輸入的是1");
                break;
            case 2:
                System.out.println("輸入的是2");
                break;
            default:
                System.out.println("請輸入1或2");
        }
    }
}
