class Solution {
    public int solution(int[] num_list) {
        int numAdd = 0;
        int numMul = 1;
        // 합
        for(int i: num_list){
            numAdd += i;
        }
        // 곱
        for(int i: num_list){
            numMul *= i;
        }
        
        return numMul < (numAdd*numAdd) ? 1 : 0;
    }
}