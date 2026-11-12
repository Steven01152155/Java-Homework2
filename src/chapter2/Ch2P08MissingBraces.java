import java.util.Scanner;

public class Ch2P08MissingBraces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入整數");
        int number = scanner.nextInt();

        // 未加大括號時，只有緊接在 if 後面的第一行受條件控制。
        if (number == 1)
            System.out.println("輸入的是1");
        System.out.println("這一行不在 if 區塊內");

        System.out.println("結束處理");
    }
}
