import java.util.Scanner;

public class Ch3P38StringSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入字串");
        String text = scanner.nextLine();

        System.out.println("請輸入要檢索的文字");
        char target = scanner.nextLine().charAt(0);
        int index = text.indexOf(target);

        if (index != -1) {
            System.out.println(text + "的第" + (index + 1) + "個字就是「" + target + "」");
        } else {
            System.out.println(text + "中沒有「" + target + "」這個字");
        }
    }
}
