public class Ch2P41ArrayIndex {
    public static void main(String[] args) {
        int[] scores = {80, 60, 22, 50, 75};

        try {
            scores[10] = 75;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("索引10超過陣列範圍0到" + (scores.length - 1));
        }
    }
}
