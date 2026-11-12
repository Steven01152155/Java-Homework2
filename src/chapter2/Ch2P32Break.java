import java.util.Scanner;

public class Ch2P32Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請問要在第幾次處理結束迴圈呢？(1~10)");
        int stopAt = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println("第" + i + "次的處理。");
            if (i == stopAt) {
                break;
            }
        }
    }
}
