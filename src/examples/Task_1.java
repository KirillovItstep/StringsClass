package examples;

public class Task_1 {
    public static void main(String[] args) {
        //поиск совпадения буквы из "таргета" в данном слове и добавление его в результат
        String givenWord = "rkqwodl";
        String target1 = "world";

        char[] wordArr = givenWord.toCharArray();
        char[] target1Arr = target1.toCharArray();
        StringBuilder sb = new StringBuilder();

        //брейк, чтобы не было повторных сопадений
        for (char ch : target1Arr) {
            for (char letter : wordArr) {
                if (ch == letter) {
                    sb.append(ch);
                    break;
                }
            }
        }
        String result = sb.toString();
        System.out.println(target1.equals(result));
    }
}