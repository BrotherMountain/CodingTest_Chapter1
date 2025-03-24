# 성공 여부

성공 여부: 실패

왜 실패했는가?

패턴을 보려고 나열을 했는데

이게 오히려 헷갈리게 만들었음

for 문의 i가 2*k마다 + 된다는 것을 인지하지 못함   
   
right 값이 k-1만큼 커진다는 것을 인지하지 못함

# 풀이

```java
public String reverseStr(String s, int k) {
    char[] charArray = s.toCharArray();
    for (int i = 0; i < charArray.length; i += 2 * k) {
        int left = i;
        int right = Math.min(i + k - 1, s.length() - 1);

        while (left < right) {
            char tmp = charArray[left];
            charArray[left++] = charArray[right];
            charArray[right--] = tmp;
        }
    }
    return new String(charArray);
}
```

String 타입을 배열로 만들기 위해서 toCharArray()사용

조건에서 매 2k 문자마다 처음 k 문자까지 뒤집는다고 함

예를 들어

s = abcdefghijklmnopqrstu  , k = 4라면

2k까지 문자열은 abcdefgh

여기서 k번째 문자까지인 **abcd** 는 뒤집음

efgh는 뒤집지 않음

이제 남은 문자열인

ijklmnopqrstu

에서

2k까지 문자열인

ijklmnop

여기서 k번째 문자인 **ijkl** 는 뒤집음

mnop는 뒤집지 않음

다시 남은 문자열

qrstu

그런데 문자열이 2k보다는 작음

그러므로 qrst는 뒤집고 u는 그대로 둠

이제 패턴을 보면

```java
for (int i = 0; i < charArray.length; i += 2 * k) {
    int left = i;
    int right = Math.min(i + k - 1, s.length() - 1);
}
```

left는 2 * k씩 추가됨

즉 0, 2k, 4k, 6k

right는 3k-1씩 추가됨

why?

k만큼 인덱스 값을 뒤집어야 하기 때문에

-1를 한 이유는 k번째 인덱스는 다음 left의 대상이기 때문에 예외

즉, 2k에 k-1번째 만큼 건너뛰어서 뒤집음

마지막으로 Math.min을 하는 이유는

**남은 문자가 k보다 적으면, 남은 모든 문자를 뒤집어라**

이 조건때문임

만약 전체 배열 내 크기가 k보다 작으면

k값을 right에 넣으면 인덱스값을 벗어나게 됨

그러므로 right에 전체 배열 길이를 넣어서

마무리를 해야함