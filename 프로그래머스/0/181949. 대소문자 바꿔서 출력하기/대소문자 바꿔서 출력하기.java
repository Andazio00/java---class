import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String reStr = "";
        char rechar;
        
        //=> 0부터  문자열 a 길이까지 길이까지 
        for(int i = 0 ; i<a.length() ; i++){
          
            // 소문자라면
            if( 97 <= a.charAt(i) && 122 >= a.charAt(i)){
                rechar = (char) a.charAt(i);
                   reStr += String.valueOf(rechar).toUpperCase();
            
            // 대문자라면
            } else if( 65 <= a.charAt(i) && 90 >= a.charAt(i) ){
                rechar = (char) a.charAt(i);
                  reStr += String.valueOf(rechar).toLowerCase();
            }
            
     
        }
        
               // 최종결과 출력
           System.out.println(reStr);
        
    }
}