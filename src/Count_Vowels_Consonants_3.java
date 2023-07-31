public class Count_Vowels_Consonants_3 {
    public static void main(String[] args) {
        String str= "Hello World";
        str= str.toLowerCase();
        int vowelCount=0;
        int consonatnCount=0;
        for(int i=0;i<str.length(); i++) {

            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonatnCount++;
                }
            }
        }
        System.out.println(vowelCount);
        System.out.println(consonatnCount);
    }
}
