import java.util.Scanner;

public class Ch2P45BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        System.out.println("請輸入5個人的分數");

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }

        for (int end = scores.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (scores[i] < scores[i + 1]) {
                    int temporary = scores[i];
                    scores[i] = scores[i + 1];
                    scores[i + 1] = temporary;
                }
            }
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "名的分數是" + scores[i]);
        }
    }
}
