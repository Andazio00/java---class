import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String subStr = "";
        int i; 
        
        for( i = 1 ; i<=n ; i++ ){
          subStr += str;
        }
        
        System.out.println(subStr);
    
    }
}