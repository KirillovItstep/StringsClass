public class Strings4 {
    public static void main(String[] args) {
        String word = "word";
        StringBuilder sb = new StringBuilder(word);
        String s = sb.reverse().toString();
        System.out.println(s);

        int a = 12345;
        s = Integer.toString(a);
        s = String.valueOf(a);
        sb = new StringBuilder(s);
        s = sb.reverse().toString();
        int b = Integer.parseInt(s);
        System.out.println(b);
    }
}
