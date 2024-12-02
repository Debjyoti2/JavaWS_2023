package practice.com;

import java.util.stream.IntStream;

public class FindPalindromeSubString {

    public static void main(String[] args) {

        String str = "abbaeae";
        for(int i=0;i<str.length()-1;i++){
            for(int j=i;j<str.length()-1;j++){
                String substr = str.substring(i,j);
                if(isPalindrome(substr)){
                    System.out.println(substr);
                }
            }
        }

    }

    public static boolean isPalindrome(String substr){
        //abab
        if(substr !=null && !" ".equalsIgnoreCase(substr) && substr.length()>1){
            boolean anyUnmatchedChar= IntStream.range(0,substr.length()/2).anyMatch(e->substr.charAt(e)!=substr.charAt(substr.length()-1-e));
            if(anyUnmatchedChar){
                return false;
            }else {
                return true;
            }
        }
        else {
            return false;
        }
    }

}
