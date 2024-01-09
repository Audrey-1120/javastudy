package pkg05_void_return;

public class Calculator {
  
  void root(int number) {
    
    // 반환타입이 void인 경우에는 return; 코드로 메소드 실행을 중지할 수 있다.
    
    if(number <= 0) { //보통 메소드가 동작하지 못하는 조건만 if문으로 처리 후 아래에는 정상적인 코드만 작성한다.
      System.out.println(number + "는 제곱근을 계산할 수 없습니다.");
      return;
    }

    System.out.println(number + "의 제곱근은 " + Math.sqrt(number) + "입니다.");
  }
  
}
