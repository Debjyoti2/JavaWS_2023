package practice.com;

public class Rev_String_without_moving_special_char {

    public static void main(String[] args) {

        // Input: str = “a,b$c”
        // Output: str = “c,b$a”

        //0==4 length-1
        String str = "a,b$c";
        char[] strarray = new char[str.length()];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=str.length()-1;i++){
            if(Character.isAlphabetic(str.charAt(i))){
                strarray[i]=str.charAt(str.length()-i-1);
            }
            else{
              strarray[i] =str.charAt(i);
            }
            sb.append(strarray[i]);
        }
        System.out.println("reverse str ::  " + sb.toString());

    }
}
