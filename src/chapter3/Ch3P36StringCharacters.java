public class Ch3P36StringCharacters {
    public static void main(String[] args) {
        String text = "Hello";
        char first = text.charAt(0);
        char second = text.charAt(1);
        int length = text.length();

        System.out.println(text + "的第一個字元是" + first);
        System.out.println(text + "的第二個字元是" + second);
        System.out.println(text + "的長度是" + length);
    }
}
