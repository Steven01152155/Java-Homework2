import java.util.Scanner;

public class Ch2P16SwitchChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入a或b");
        String text = scanner.nextLine();
        char letter = text.charAt(0);

        switch (letter) {
            case 'a':
                System.out.println("輸入的是a");
                break;
            case 'b':
                System.out.println("輸入的是b");
                break;
            default:
                System.out.println("請輸入a或b");
        }
    }
}
