class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        String result = n+ineq+eq+m;
        
        if(result.equals(n+"<="+m)) {
        	if(n<=m) {
        		answer = 1;
        	}
        }else if(result.equals(n+">="+m)) {
        	if(n>=m) {
        		answer = 1;
        	}
        }else if(result.equals(n+"<!"+m)) {
        	if(n<m) {
        		answer = 1;
        	}
        }else {
        	if(n>m) {
        		answer = 1;
        	}
        }
        
        return answer;
    }
}