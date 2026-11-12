import java.util.Scanner;

public class Ch2P34Continue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("要跳過第幾次的處理呢？(1~10)");
        int skip = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            if (i == skip) {
                continue;
            }
            System.out.println("第" + i + "次的處理。");
        }
    }
}
