package examples;

public class InfectedCitizen {
    public static void main(String[] args) {
        String city = "not i th ";
        StringBuilder sb = new StringBuilder(city);
        int first, second;
        for (int i = 0; i < sb.length(); i++)
            if (sb.charAt(i) == 'i' || sb.charAt(i) == 'I') {
                if (i == 0 || sb.charAt(i - 1) == ' ') {
                    first = i;
                    second = i + 2;
                } else if (i == sb.length() - 1 || sb.charAt(i + 1) == ' ') {
                    first = i;
                    second = i + 1;
                } else {
                    first = i - 1;
                    second = i + 2;
                }
                while (second<sb.length() && (sb.charAt(second - 1) == 'i' || sb.charAt(second - 1) == 'I'))
                    second++;
                sb.delete(first, second); //inclusive, exclusive
            }
        //Удалить последовательности, где больше одного пробела
        //Начальные
        while (sb.length() > 0 && sb.charAt(0) == ' ')
            sb.deleteCharAt(0);
        //Конечные
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ')
            sb.deleteCharAt(sb.length() - 1);
        //В середине
        for (int i = 0; i < sb.length(); i++)
            if (sb.charAt(i) == ' ') {
                i++;
                while (sb.charAt(i) == ' ')
                    sb.deleteCharAt(i);
            }
        System.out.println(sb);
    }
}