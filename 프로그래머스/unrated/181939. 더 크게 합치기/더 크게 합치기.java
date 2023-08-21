class Solution {
    public int solution(int a, int b) {
        
        String ab = a + "" + b;
        String ba = b + "" + a;
        
        int AB = Integer.parseInt(ab);
        int BA = Integer.parseInt(ba);
        
        return (AB > BA) ? AB : BA;
    }
}