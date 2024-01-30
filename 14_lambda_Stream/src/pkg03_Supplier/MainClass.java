package pkg03_Supplier;

import java.util.function.Supplier;

public class MainClass {

  /*
   * java.util.function.Supplier
   * 1. 형식
   *    public interface Supplier<T> {
   *      T get();
   *    }
   * 2. 파라미터 X, 반환 O 형식의 get() 메소드를 지원하는 함수형 인터페이스이다.
   */
  
  public static void method1() {
    
    Supplier<String> supplier = () -> "hello world";
    System.out.println(supplier.get());
  }
  
  public static void method2(Supplier<String> supplier) {
    System.out.println(supplier.get());
  }
  
  public static void method3(Supplier<Integer> supplier) {
    System.out.println(supplier.get());
  }
    
  public static void main(String[] args) {
    
    method1();
    
    /*
    Supplier<String> supplier = () -> "hello world";
    method2(supplier);
    */
    
    // 위의 코드와 같음.
    method2(() -> "hello world");
    // Supplier를 직접 작성하는 경우는 거의 없다. 만약 Supplier를 파라미터로 선언한다면,
    // lambda로 전달하는 것이 보통 일반적이다.
    
    // Supplier는 lambda로 전달할 것!!
    
    
    // 호출할 때마다 1 ~ 10 사이의 난수를 출력하는 method3
    method3(() -> (int)(Math.random()*10 + 1)); 
    
  }

}
