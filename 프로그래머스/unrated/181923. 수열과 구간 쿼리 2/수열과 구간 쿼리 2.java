class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] answer = new int[queries.length];
        int[] moreK = null;
        int s, e, k, min = 0;
        
        for(int q = 0; q < queries.length; q++){
            
            min = -1;
            
            for(int j = 0; j< queries[q].length; j++){
                s = queries[q][0];
                e = queries[q][1];
                k = queries[q][2];
                
                moreK = new int[(e-s)+1];
                
                for(int i = s; i <= e; i++){ // arr에서 k보다 큰값만 저장
                    if(arr[i] > k){
                        moreK[i-s] = arr[i];
                    }
                }
                // k의 최소 = 0이므로 moreK[i]의 원소가 0(초기값)이라면 해당 index의 arr값이 k보다 크거나 같아 삽입되지않은것
                // 즉 moreK[i]의 유의미한 값은 1이상의 정수고, 0은 무의미한 값
                for(int i = 0; i < moreK.length; i++){
                    if(moreK[i] > 0){
                        if(min == -1){
                            min = moreK[i];
                        }else{
                            min = Math.min(min, moreK[i]);
                        }
                    }
                }
            }
            answer[q] = min;
        }
        
                 
        return answer;
    }
}