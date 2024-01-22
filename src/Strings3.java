import java.util.Arrays;

public class Strings3 {
    public static void main(String[] args) {
        String s = "Посчитать количество повторяющихся символов в строке";

        String sUnique = ""; //StringBuilder
        for (int i=0; i<s.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < i; j++)
                if (s.charAt(i)==s.charAt(j))
                    flag = false;
            if (flag) sUnique+=s.charAt(i);
        }
        System.out.println(sUnique);
        System.out.println(sUnique.length());
        // Посчитать количество уникальных символов
        System.out.println(s.length()-sUnique.length());

        //Посчитать количество этих символов в строке
        int counts[] = new int[sUnique.length()];
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int index = sUnique.indexOf(Character.toString(c));
            if (index!=-1)
                counts[index]++;
        }
        System.out.println(Arrays.toString(sUnique.toCharArray()));
        System.out.println(Arrays.toString(counts));


    }
}
