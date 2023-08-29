class Solution {
    public String solution(String code) {
        String ret = "";
        
        char[] codeA = code.toCharArray();
        
        int mode = 0;
        
        for(int i = 0; i < codeA.length; i++) {
        	
        	if(mode == 0) {
        		if(codeA[i] != '1') {
        			if(i%2 == 0) {
        				ret += codeA[i];
        			}
        		}else {
        			mode = 1;
        		}
        	}
        	else { //mode 가 1 일 떄
        		if(codeA[i] != '1') {
        			if(i%2 == 1) {
        				ret += codeA[i];
        			}
        		}else {
        			mode = 0;
        		}
        	}
        }
        
        return ret.equals("")? "EMPTY" : ret;
    }
    
    
}