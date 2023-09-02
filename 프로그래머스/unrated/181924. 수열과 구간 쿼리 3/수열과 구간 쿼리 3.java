class Solution {
    public int[] solution(int[] arr, int[][] queries) {    
        int temp = 0;
        
        for(int i = 0; i < queries.length; i++ ){
            int front = queries[i][0];
            int back = queries[i][1];
            
            temp = arr[front];
            arr[front] = arr[back];
            arr[back] = temp;
        }
        
        return arr;
    }
}