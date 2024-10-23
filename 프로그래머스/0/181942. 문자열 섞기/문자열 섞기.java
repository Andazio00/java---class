class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        int i ;
        
        int n = str1.length();
        
        for(i = 0 ; i< n ; i ++ ){
 
          answer += str1.charAt(i);
          answer += str2.charAt(i);
            
        }
        
        return answer;
    }
}