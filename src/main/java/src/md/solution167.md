# 기록

포인트 두 개 생성

j는 i보다 1 크다

j의 크기가 numbers.length와 같아지면

i값 크기 높이고 초기화

# 성공 여부

성공 여부: 80% 성공

첫 시도

```java
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int i = 0, j = i + 1;
        while (i < numbers.length) {
            if (numbers[i] + numbers[j]== target) {
                ans = new int[]{i + 1, j + 1};
                break;
            }
            j++;
            if (j == numbers.length) {
                i++;
                j = i + 1;
            }
        }
        return ans;
    }
}
```

시간 복잡도를 생각하지 않음

힌트를 통해서 문제 해결

# 풀이

```java
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length-1;
        int[] ans = new int[2];
        while (i < numbers.length && j >= 0) {
            if (numbers[i] + numbers[j] == target) {
                ans = new int[]{i + 1, j + 1};
                break;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                j--;
            } 
        }
        return ans;
    }
}
```

핵심은 오름차순 정렬 상태의 배열이 주어진다는 것

우선 포인트를 양쪽 끝단에 배치

두 포인트 값을 더하기

target과 비교해서 크면 값은 현재 위치보다 왼쪽 인덱스가 현재보다 오른쪽에 위치함

반대로 작으면 현재 위치보다 오른쪽 인덱스가 왼쪽에 위치함

why? 오름차순 정렬이라 값의 분포도는 대략 오른쪽으로 갈수록 크고 왼쪽으로 갈수록 낮아짐

그렇게 두 합산의 크기를 조절해가면서 찾으면 됨