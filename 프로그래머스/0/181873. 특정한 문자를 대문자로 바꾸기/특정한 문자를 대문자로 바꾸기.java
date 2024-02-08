class Solution {
    public String solution(String my_string, String alp) {
        
        return my_string.toLowerCase().replaceAll(alp, alp.toUpperCase());
    }
}