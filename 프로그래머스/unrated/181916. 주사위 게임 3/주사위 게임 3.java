import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int countA = 0, countB = 0; // diceValue순서대로 꺼내는용, 
        int p = 0, q = 0, r = 0;
        int[] diceValue = {a,b,c,d};
        ArrayList<Integer> tempA = new ArrayList<>(4); // 임시배열A
        ArrayList<Integer> tempB = new ArrayList<>(4); // 임시배열B
        ArrayList<Integer> tempC = new ArrayList<>(4); // 임시배열C
        
        ArrayList<Integer> pValue = new ArrayList<>(4); // 같은애들 p
        ArrayList<Integer> qValue = new ArrayList<>(4); // 다른애들 q
        ArrayList<Integer> other = new ArrayList<>(4);  // 또다른애들 
        
        // diceValue를 하나씩 돌면서 tempA, tempB에 추가 
        for(int i : diceValue) {
        	if(tempA.isEmpty()) {
        		tempA.add(i);
        	}else {
        		// tempA의 가장 최근 더해진 값과 비교하기 위해 count를 따로 선언하고 여기서 ++ 해줌 
        		if(i == tempA.get(countA)) {
        			tempA.add(i);
        			countA++;
        		}else {
        			if(tempB.isEmpty()) {
        				tempB.add(i);
        			}else {
        				if(i == tempB.get(countB)) {
                			tempB.add(i);
                			countB++;
                		}else {
                			tempC.add(i);
                		}
        			}
        		}
        	}
        }
        	// A > B > C, A > C > B
        if( Math.max(Math.max(tempA.size(), tempB.size()), tempC.size()) == tempA.size() ) {
        	pValue = tempA;
        	if(Math.max(tempB.size(), tempC.size()) == tempB.size()) {
        		qValue = tempB;
            	other = tempC;
        	}else {
        		qValue = tempC;
        		other = tempB;
        	}
        	
        }	// B > A > C, B > C > A 
        else if(Math.max(tempB.size(),tempC.size()) == tempB.size()){
        	pValue = tempB;
        	if(Math.max(tempA.size(), tempC.size()) == tempA.size()) {
        		qValue = tempA;
        		other = tempC;
        	}else {
        		qValue = tempC;
        		other = tempA;
        	}
        }	// C > A > B, C > B > A
        else {
        	pValue = tempC;
        	if(Math.max(tempA.size(), tempB.size()) == tempA.size()) {
        		qValue = tempA;
        		other = tempB;
        	}else {
        		qValue = tempB;
        		other = tempA;
        	}
        }
        // 이건 꼭 안해도 되지만 switch 문을 보기 쉽게 하기위해 사용 
        p = pValue.get(0);
        if(qValue.isEmpty() == false) {	// 1,1,1,1 같은 경우 qValue에 요소가 없어서 index오류나기 때문에 조건문 걸어줌 
        	q = qValue.get(0);
        }
        if(other.isEmpty() == false) {
        	r = other.get(0);
        }
        
        switch(pValue.size()) {
        case 4 : answer = p * 1111; 
        		break;
        case 3 : answer = (int)Math.pow((10*p+q), 2); 
        		break;
        case 2 : 
        	if(pValue.get(0) != pValue.get(1)) {
        		answer = Math.min(Math.min(Math.min(a,b), c), d);	// 4가지 모두 다른 경우 
        	}else {
        		if(other.isEmpty()) {								// 2개씩 같은경우 
            		answer = (p+q)*Math.abs(p-q);
            	}else {
            		answer = q*r;									// 2개 같고 나머지는 다른 경우 
            	}
        	}
        		break;
        default : 
        		break;
        }
        
        return answer;
    }
}