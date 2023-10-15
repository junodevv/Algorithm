class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer;
        
        for(int i = 0; i < query.length; i++){
            if(i == 0 || i % 2 == 0){
                arr = cut(arr, 0, query[i]+1);
            }else{
                arr = cut(arr, query[i], arr.length);
            }
        }
        answer = arr;
        return answer;
    }
    public int[] cut(int[] arr, int start, int end){
        int[] temp = new int[end - start];
        for(int i = start; i < end; i++){
            temp[i-start] = arr[i];
        }
        return temp;
    }
}