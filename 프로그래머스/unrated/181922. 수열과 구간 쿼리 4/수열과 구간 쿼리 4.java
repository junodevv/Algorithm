class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int s, e, k = 0;
        
        for(int idx = 0; idx < queries.length; idx++){
            s = queries[idx][0];
            e = queries[idx][1];
            k = queries[idx][2];
            
            for(int i = s; i <= e; i++){
                if(i == 0){
                    arr[i] += 1;
                }else{
                    if(i % k == 0){
                        arr[i] += 1;
                    }
                }
            }
        }
        
        return arr;
    }
}