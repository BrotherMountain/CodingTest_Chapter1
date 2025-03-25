# 기록

가장 단순한 버블정렬로 정렬하기

# 성공 여부

성공 여부: 반 성공

왜?

매우 단순하게

돌아가게만 만듬

배열을 새로 만들 생각 없이

원본 배열을 수정했음

# 풀이

```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {
            nums[i] = nums[i] * nums[i];
        }
        
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}
```

코드 설명

우선 각 숫자를 제곱해서 넣음

그 뒤, 버블정렬로 값을 정렬시킴

# 모범 답안

```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[i] = nums[left] * nums[left];
                left++;
            } else {
                res[i] = nums[right] * nums[right];
                right--;
            }
        }
        return res;
    }
}
```

새 배열 만들기

두 개의 포인터를 사용

Math함수를 이용해서 절대값만 확인하기

양 포인트에서 값 비교해서 왼쪽이 더 크면

왼쪽 포인트의 값을 제곱한 뒤 값 넣기