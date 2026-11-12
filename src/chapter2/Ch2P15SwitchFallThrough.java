import java.util.Scanner;

public class Ch2P15SwitchFallThrough {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入整數");
        int number = scanner.nextInt();

        // 故意省略 break，示範 switch 的 fall-through 行為。
        switch (number) {
            case 1:
                System.out.println("輸入的是1");
            case 2:
                System.out.println("輸入的是2");
            default:
                System.out.println("請輸入1或2");
        }
    }
}
