class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        StringBuilder sbEven = new StringBuilder();
        StringBuilder sbOdd = new StringBuilder();
        
        for(int i : num_list){
            if(i%2 == 0){
                sbEven.append(i);
            }
            else{
                sbOdd.append(i);
            }
        }
        answer = Integer.parseInt(sbEven.toString()) + Integer.parseInt(sbOdd.toString());
        return answer;
    }
}