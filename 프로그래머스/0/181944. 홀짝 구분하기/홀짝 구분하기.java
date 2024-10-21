import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        // 짝수다라는 것은  2로나누었을때  나머지가 0이다 
        // 홀수라는 것은 2로 나누었을때  나머지가 0이 아니다
        // 문제에서 한줄 출력이므로 print이용
        if(n % 2 == 0){
            System.out.print(n + " "+ "is even");  
        }else if(n % 2 != 0){
            System.out.print(n + " " + "is odd");
        }
    }
}