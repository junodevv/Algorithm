class Solution {
    private static final int ARRAY_START = 0;
    private static final int QUERIES_S = 0;
    private static final int QUERIES_E = 1;
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int i=0; i < queries.length; i++){
            int s = queries[i][QUERIES_S];
            int e = queries[i][QUERIES_E];
            for(int j=0; j < arr.length; j++){
                if(j >= s && j <= e ){
                    arr[j] += 1;
                }
            }
        }
        answer = arr;
        return answer;
    }
}