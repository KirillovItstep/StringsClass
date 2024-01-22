package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        //1
        Pattern pattern = Pattern.compile("\\w\\s");
        Matcher matcher = pattern.matcher("a ");
        boolean b = matcher.matches();
        System.out.println(b);

        //2
        boolean b2 = Pattern //chaining
                .compile("\\w\\s")
                .matcher("a ")
                .matches();
        System.out.println(b2);

        //3
        boolean b3 = Pattern.matches("\\w\\s","a ");
        System.out.println(b3);

        check("\\w\\s","a ", "a1");

        //Строка содержит только один символ
        check(".","a", "a1");

        //Строка содержит одну или более букву "a", а за ней одну букву "b" (aab)
        check("a+b","aab", "abb");

        //Строка содержит несколько или ни одной буквы "a", а за ней одну букву "b"
        check("a*b","aab", "abb");

        //Слово состоит из двух букв, первая из которых "a" (но ее может и не быть)
        check("a?[a-zA-Z]","ab", "a_");

        //Строка начинается на букву "a"
        check("a.*","ab", "b_");
        check("[Aa].*","Ab", "b_");

        //Строка заканчивается на букву "a"
        check(".*a","aba", "b_");

        //Строка заканчивается на "as"
        check(".*as","abas", "b_a");

        //Строка содержит "as"
        check(".*as.*","as", "b_sa");

        //Строка не содержит "a"
        check("[^a]*","", "b_sa");

        //Слово (буквенная строка) содержит букву "a"
        check("[a-zA-Z]*a[a-zA-Z]*","sdafs", "bssdf");

        //В строке содержатся цифры
        check(".*\\d+.*","sd3334afs", "bssdf");

        //Строка содержит только цифры
        check("\\d+","12", "12a");

        //Строка является вещественным числом с фиксированной точкой
        check("[+-]?\\d+\\.?\\d+","-12.53", "12a");

        //Содержит ни одного или более сочетаний "ab", а затем "c"
        check(".*(ab)*c","ababc", "12a");

        //Содержит одно или более сочетаний "ab", а затем "c"
        check(".*(ab)+c","ababc", "12a");

        //Проверить написание номера телефона в формате 8(123)-123-45-67
        check("8\\(\\d{3}\\)-\\d{3}-\\d{2}-\\d{2}","8(123)-320-20-00", "bssdf");

        //Строка не должна начинаться с букв a,b
        check("[^ab].*","cab", "abc");

        //Строка является "end."
        check("end.","end.", "abc");
    }

    static void check(String regex, String sTrue, String sFalse){
        boolean bTrue = Pattern.matches(regex,sTrue);
        boolean bFalse = Pattern.matches(regex,sFalse);
        System.out.printf("%b %b%n", bTrue, bFalse);
        //%d %f %c %s %b %n
    }
}
