public class Palindrome_2 {
    public static void main(String[] args) {
        String str = "madam";
        String result = "";

      for(int i=str.length()-1 ; i>=0 ; i--){
            result+=str.charAt(i);
        }
        if(result.equals(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

        //System.out.println(ispalindrome(str));
    }

    ///Best Case Method
//        public  static boolean ispalindrome(String str){
//            int i=0;
//            int j=str.length()-1;
//
//            while (i<=j){
//                if(str.charAt(i) != str.charAt(j)){
//                   return false;
//                }
//                i++;
//                j--;
//            }
//            return true;
//        }
}

