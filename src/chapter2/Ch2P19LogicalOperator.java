import java.util.Scanner;

public class Ch2P19LogicalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請問你是男生嗎？");
        System.out.println("請輸入Y或N");
        char answer = scanner.nextLine().charAt(0);

        if (answer == 'Y' || answer == 'y') {
            System.out.println("你是男生啊！");
        } else if (answer == 'N' || answer == 'n') {
            System.out.println("你是女生啊！");
        } else {
            System.out.println("請輸入Y或N");
        }
    }
}
