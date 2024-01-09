package pkg03_return;

public class MainClass {

  public static void main(String[] args) {
    
    
    // Calculator 타입의 calculator 객체 선언 및 생성
    Calculator calculator = new Calculator();
    
    calculator.method1(); // 잘못된 호출이라고 볼 수 있음.
    
    // 반환값이 있을 땐 그 반환값을 사용할 수 있는 추가의 식이 있어야 함.
    
    // 반환값의 호출 예시
    System.out.println(calculator.method1());
    System.out.println(calculator.method1() == 10 ? "10이다" : "10이 아니다.");
    int a = calculator.method1();
    System.out.println(a);
    
    // int[] 반환 받기
    int[] arr = calculator.method2();
    for(int n : arr) {
      System.out.println(n); 
    }
    
    for(int n : calculator.method2()) {
      System.out.println(n);
    }
    
    // Adder 객체 반환 받기
    int result = calculator.method3().add(1, 2, 3);
    System.out.println(result);
    
    //calculator.method3().add(1,2,3) => new Adder().method3().add(1,2,3)
   
    
    
    
    
  }

}
