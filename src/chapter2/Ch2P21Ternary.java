import java.util.Scanner;

public class Ch2P21Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請問要選哪條路線？");
        System.out.println("請輸入整數");
        int choice = scanner.nextInt();

        char route = choice == 1 ? 'A' : 'B';
        System.out.println("選擇了" + route + "路線");
    }
}
