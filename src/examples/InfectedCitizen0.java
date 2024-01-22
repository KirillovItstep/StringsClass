package examples;
/*
Each "word" in string represents a house, and each letter represents a citizen.
All infected citizen represents as "i" or "I".
You must eradicate them and their neighbors.
The distance between houses has to have only one whitespace.
string -> stg
striing ->stg
iii->
It is a bit chilly -> a cly
It is not there -> not there

string -> stg
it is not there -> not there
 */
public class InfectedCitizen0 {
    public static void main(String[] args) {
       String city = "striinghf";
       StringBuilder sb = new StringBuilder(city);
       for (int i=0; i<sb.length(); i++){
           int left=0, right=0;
           if (sb.charAt(i)=='i') {
               left = i - 1;
               if (left < 0) left = 0;
               while (sb.charAt(i++) == 'i' && i<sb.length());
               right = i + 2;
               if (right > sb.length())
                   right = sb.length();
               sb.delete(left, right);
               i = 0;
           }
       }
        System.out.println(sb);
    }
}
