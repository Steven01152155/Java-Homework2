import java.util.Scanner;

public class Ch3P37StringCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入英文字母");
        String text = scanner.nextLine();

        String upper = text.toUpperCase();
        String lower = text.toLowerCase();
        System.out.println("轉換成大寫時為" + upper);
        System.out.println("轉換成小寫時為" + lower);
    }
}
