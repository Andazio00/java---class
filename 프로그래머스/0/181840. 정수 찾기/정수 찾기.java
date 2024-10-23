class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        
        // num_list 전체 순회
        for(int i = 0 ; i<num_list.length ; i++){
           
            // num_list 안에 n 찾기
            if(num_list[i] == n){
                return 1;  // n이 있으면  1리턴           
            }else{  // 아니면
                answer = 0;  // 1대신 0리턴 
            }
        }
        
        return answer;  
    }
}