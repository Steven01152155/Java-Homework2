import java.util.Scanner;

public class Ch3P40StringBuffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入字串。");
        String original = scanner.nextLine();

        System.out.println("請輸入要新增的字串。");
        String addition = scanner.nextLine();

        StringBuffer buffer = new StringBuffer(original);
        buffer.append(addition);
        System.out.println("在「" + original + "」後新增「" + addition + "」後，會變成「" + buffer + "」。");
    }
}
