public class Ch2P39ArrayDeclaration {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[5];

        scores[0] = 80;
        scores[1] = 60;
        scores[2] = 22;
        scores[3] = 50;
        scores[4] = 75;

        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "個人的分數是" + scores[i] + "分");
        }
    }
}
