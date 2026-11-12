import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ch2P47ArraysSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] scores = new Integer[5];
        System.out.println("請輸入5個人的分數");

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }

        Arrays.sort(scores, Collections.reverseOrder());

        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "名的分數是" + scores[i]);
        }
    }
}
