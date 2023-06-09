# Array
2023-04-12 수요일

자바 언어에서 **동일한 데이터 유형의 값**들을 담을 수 있는 **고정 길이** 데이터 구조.
배열은 선언 시 크기가 결정됩니다. 한 번 생성된 배열의 크기는 변경할 수 없습니다.
배열 변수는 메모리 공간을 참조합니다.

배열을 선언할 때는 데이터 유형을 지정하고 대괄호를 사용해서 배열임을 나타냅니다.

다음은 배열을 생성하는 예제 입니다.
```java
int[] myArray = new int[10];
```
_배열의 요소는 0으로 초기화 됩니다_

배열의 요소에 접근하려면 인덱스를 사용합니다.
다음은 배열의 요소를 접근하는 예제입니다
```java
myArray[0] = 1;
myArray[1] = 2;
int sum = myArray[0] + myArray[1];
```

이 예제는 배열의 첫번째 요소와 두번째 요소를 더해서 sum 변수에 저장합니다.

배열의 크기를 알고 있다면 for루프와 함께 사용해서 배열의 모든 요소를 반복적으로 처리할 수 있습니다.

```java
for(int i=0;i<myArray.length;i++){
    System.out.println(myArray[i]);
}
```

이 예제는 ```for``` 루프를 사용해서 모든 요소를 반복하고 ```println```메소드를 사용해서
각요소를 출력합니다. ```length```속성을 사용해서 배열의 크기를 가져올 수 있습니다.

[배열코드_2023_04_12](https://github.com/ljm9894/Java_Study/blob/master/src/kr/hs/dgsw/java/Array/ArrayStudy.java)