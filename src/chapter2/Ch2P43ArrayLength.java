public class Ch2P43ArrayLength {
    public static void main(String[] args) {
        int[] scores = {80, 60, 22, 50, 75};

        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "個人的分數是" + scores[i] + "分");
        }
        System.out.println("考試人數為" + scores.length + "人");
    }
}
