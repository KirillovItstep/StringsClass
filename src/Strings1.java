import java.util.Arrays;

public class Strings1 {
    public static void main(String[] args) {
        String s;
        s = "string 1"; //=>int хеш-код
        System.out.println(s.hashCode());
        s = "string 2" + s;
        System.out.println(s.hashCode());
        //Object o;

        char c = '1'; //49
        System.out.println((int)c);

        //s1="admin" s2="fjfk2334sdkf"; //коллизия
        String s2 = new String("string 1");
        System.out.printf("%d %d%n",s.hashCode(), s2.hashCode());

        //Выделить символ из строки
        c = s.charAt(s.length()-1);
        System.out.println(c);

        char c1 = '2', c2 = '\u00B7', c3 = '\u03C0', c4 = '=', c5 = '1',
                c6 = '8', c7 = '0', c8 = '\u00B0';
        s = ""+c1+c2+c3+c4+c5+c6+c7+c8;
        System.out.println(s);

        String s1 = "first"; s2 = "eirst";
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));

        //Проверить, содержит ли строковое значение только цифры
        String s3 = "1234234";
        boolean result = true;
        for (int i=0; i<s3.length(); i++)
            if (!Character.isDigit(s3.charAt(i)))
                result = false;
        System.out.println(result);

        //Проверить, содержит ли строка данную последовательность символов
        s = "good";
        s2 = "oo";
        System.out.println(s.contains(s2));

        //Проверить, одинаковы ли строки
        s = "good";
        //s2 = "good";
        s2 = new String("good");
        boolean answer = s == s2 ? true : false; //Ссылки
        answer = s.equals(s2) ? true : false; //Содержимое
        System.out.println("Строки одинаковы: " + answer);

        //Заменить символ в строке (точку на вопросительный знак)
        s = "Why is garbage collection necessary in Java.";
        int i = s.indexOf('.');
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(i,'?');
        s = sb.toString();
        System.out.println(sb);

        //Заменить подстроку в строке
        s = "JVM is a %s virtual machine %s.";
        s = s.replace("%s","Java");
        System.out.println(s);

        //Извлечь из строки подстроку JRE
        s = "JDK vs JRE vs JVM";
        i = s.indexOf("JRE");
        s2 = s.substring(i,i+"JRE".length());
        System.out.println(s2);

        //Удалить все скобки из выражения
        s = "What are the {wrapper} {classes} in Java?";
        s = s.replaceAll("[{}]","");
        System.out.println(s);

        //Заменить первую букву на прописную
        s = "what is JIT compiler in Java? what";
        sb = new StringBuilder(s);
        s2 = s.substring(0, 1); //w
        s2 = s2.toUpperCase(); //W
        Character c0 = s2.charAt(0); //W
        sb.setCharAt(0, c0);
        System.out.println(sb);

        //Разбить строку на подстроки
        s = "Access modifiers in Java are: \nDefault\nPrivate\nProtected\nPublic";
        String[] sArr = s.split("\n");
        System.out.println(Arrays.toString(sArr));

        //Удалить концевые пробелы
        s = " Object-Oriented Programming or OOPs is a programming style that is associated with concepts like: "
                + "inheritance, encapsulation, polymorphism, abstraction. ";
        String sresult = s.trim();
        System.out.println(sresult);

    }
}

final class Book{
    //От него нельзя унаследоваться
}

