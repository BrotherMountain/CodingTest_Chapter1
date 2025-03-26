# 기록

포인트 두 개 생성

m + n = num1의 크기

단순하게 num에 전부다 집어넣고

정렬?

# 성공 여부

성공 여부: 성공

# 풀이

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        for (int k = m + n - 1; k > 0; k--) {
            if (i < 0 || j < 0) {
                break;
            } else {
                if (nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i--];
                } else {
                    nums1[k] = nums2[j--];
                }
            }
        }
        for (int k = 0; k <= j; k++) {
            nums1[k] = nums2[k];
        }
    }
}
```

m이 n보다 클 경우

m-n 만큼은 빈공간

빈공간은 n이 들어가야함

세 개의 지점에 포인트를 설정

배열 전체 끝부분 `k` , nums1의 끝 부분 `i`, nums2의 끝 부분 `j`

배열 전체 끝부분에서 하나씩 내려가면서 값을 비교

만약 `nums1[i] >  nums2[j]` 면

배열의 끝부분에 `nums1[i]`를 집어넣기

그 뒤 `i` 한 칸 뒤로 돌리기

반대면

배열의 끝부분에 `nums2[j]`를 집어넣기

그 뒤 `j` 한 칸 뒤로 돌리기

둘 중 하나라도 0보다 작아지면 탈출

여기서 j가 0보다 커서 남아있으면

전부다 복사된 것이 아님

그리고 나머지 값들은 전부다 원본 nums1보다 작음

why? `nums1[i] > nums[j]`가 전부 돌아갔기에 나머지 값들은 원본보다 작음

for문을 돌려서 남은 j값만큼 복사

# 모범 답안

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}
```

단순하게 배열 끝부분에 전부 집어넣은 뒤

sort돌려서 정렬시키기

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
```

for문을 꺼내지 말고

while문으로 작성

i가 먼저 0으로 갈 수 있다는 점을 이용해서

`i > = 0` 조건 넣음