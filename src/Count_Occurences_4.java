public class Count_Occurences_4 {
    public static void main(String[] args) {
        String str= "aabcbcaabckad";
        char target ='a';
        int count =0;
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i) == target){
                count++;
            }
        }
        System.out.println(count);
    }
}
