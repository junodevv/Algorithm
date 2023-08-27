class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = a+""+b;
        int abI = Integer.parseInt(ab);
        
        int ab2 = 2*a*b;
        
        return abI > ab2 ? abI : ab2;
    }
}