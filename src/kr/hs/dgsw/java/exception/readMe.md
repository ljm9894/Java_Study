# 예외처리

### 예외처리란?
코드에서 에러가 발생했을 때 에러를 그대로 실행시키지 않고
에러에 대응하는 방법을 예외처리라고 한다.

### 사용방법
- try catch문을 사용해서 예외처리를 할 수 있다
- 클래스 이름 옆에 throws를 이용해서 에러처리를 해줄 수 있다.

## 예외 종류
- IOException : 입출력에 오류가 생기면 오류를 발생시킵니다
- Exception : 전체적인 오류를 발생시킵니다.
- FileNotFoundException : 파일을 찾을 수 없을 때 오류를 발생시킵니다
- NullPointerException : null 객체에서 method를 호출하는 경우,null을 throw 하는 경우 등등