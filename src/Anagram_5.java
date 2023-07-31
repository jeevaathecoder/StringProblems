import java.util.Arrays;

public class Anagram_5 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2= "silent";

        if(str1.length()!=str2.length()){
            System.out.print("Not Anagram");
        }

        char[] char1=str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        System.out.println(Arrays.equals(char1,char2));
    }
}
