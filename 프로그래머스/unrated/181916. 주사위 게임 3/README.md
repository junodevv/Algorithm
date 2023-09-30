# [unrated] 주사위 게임 3 - 181916 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181916) 

### 성능 요약

메모리: 69.6 MB, 시간: 0.04 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 문제 설명

<p>1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.</p>

<ul>
<li>네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.</li>
<li>세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)<sup>2</sup> 점을 얻습니다.</li>
<li>주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.</li>
<li>어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.</li>
<li>네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.</li>
</ul>

<p>네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 <code>a</code>, <code>b</code>, <code>c</code>, <code>d</code>로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li><code>a</code>, <code>b</code>, <code>c</code>, <code>d</code>는 1 이상 6 이하의 정수입니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>a</th>
<th>b</th>
<th>c</th>
<th>d</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>2</td>
<td>2</td>
<td>2</td>
<td>2</td>
<td>2222</td>
</tr>
<tr>
<td>4</td>
<td>1</td>
<td>4</td>
<td>4</td>
<td>1681</td>
</tr>
<tr>
<td>6</td>
<td>3</td>
<td>3</td>
<td>6</td>
<td>27</td>
</tr>
<tr>
<td>2</td>
<td>5</td>
<td>2</td>
<td>6</td>
<td>30</td>
</tr>
<tr>
<td>6</td>
<td>4</td>
<td>2</td>
<td>5</td>
<td>2</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>예제 1번에서 네 주사위 숫자가 모두 2로 같으므로 1111 × 2 = 2222점을 얻습니다. 따라서 2222를 return 합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>예제 2번에서 세 주사위에서 나온 숫자가 4로 같고 나머지 다른 주사위에서 나온 숫자가 1이므로 (10 × 4 + 1)<sup>2</sup> = 41<sup>2</sup> = 1681점을 얻습니다. 따라서 1681을 return 합니다.</li>
</ul>

<p>입출력 예 #3</p>

<ul>
<li>예제 3번에서 <code>a</code>, <code>d</code>는 6으로, <code>b</code>, <code>c</code>는 3으로 각각 같으므로 (6 + 3) × |6 - 3| = 9 × 3 = 27점을 얻습니다. 따라서 27을 return 합니다.</li>
</ul>

<p>입출력 예 #4</p>

<ul>
<li>예제 4번에서 두 주사위에서 2가 나오고 나머지 다른 두 주사위에서 각각 5, 6이 나왔으므로 5 × 6 = 30점을 얻습니다. 따라서 30을 return 합니다.</li>
</ul>

<p>입출력 예 #5</p>

<ul>
<li>예제 5번에서 네 주사위 숫자가 모두 다르고 나온 숫자 중 가장 작은 숫자가 2이므로 2점을 얻습니다. 따라서 2를 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges

-----

# 다른사람풀이1

```java
import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {

        int[] dice = { a, b, c, d };
        Arrays.sort(dice);

        int ans = 0;

        if (dice[0] == dice[3]) {
            ans = 1111 * dice[3];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            ans = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            ans = (dice[0] + dice[3]) * (dice[3] - dice[0]);
        } else if (dice[0] == dice[1]) {
            ans = dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            ans = dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            ans = dice[0] * dice[1];
        } else {
            ans = dice[0];
        }

        return ans;
    }
}
```

### 깨달은점
1. ```Arrays``` 클래스를 이용하면 ```Arrays.sort(array)``` 함수를 이용해 오름차순으로 정렬할 수 있어서 이를 활용해 조건문을 만들 수 있다.

Ex)
```java
int[] arr = {5, 3, 4, 1, 2};

Arrays.sort(arr);

for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
```

결과: 1 2 3 4 5

-----

# 다른사람풀이2

```java
mport java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);
        // 배열로 정렬하면, 
        if (dice[0] == dice[3]) {  // 처음과 끝이 같으면 모두 같은 숫자 
            return 1111 * dice[0];
        }
        else if (dice[0] == dice[2]) {  // 세 숫자가 같은 경우 1
            return (int) Math.pow((10 * dice[0] + dice[3]),2);
        }
        else if (dice[1] == dice[3]) {  // 세 숫자가 같은 경우 2
            return (int) Math.pow((10 * dice[1] + dice[0]),2);
        }
        else if (dice[0] == dice[1] && dice[2] == dice[3]) { // 2개씩 같은 값
            return (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]);
        }
        else if (dice[0] == dice[1] || dice[1] == dice[2] || dice[2] == dice[3]) { // 2개는 동일하고, 나머지 주사위가 다른 경우
            if (dice[0] == dice[1]) {
                return dice[2] * dice[3];
            }
            else if (dice[1] == dice[2]) {
                return dice[0] * dice[3];
            }
            else {
                return dice[0] * dice[1];
            }

        }
        else {
            return dice[0];
        }
    }
}
```

1. 다른사람풀이 1과 같은 클래스함수를 이용한 풀이
