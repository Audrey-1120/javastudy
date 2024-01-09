package pkg04_overloading;

public class MainClass {

  public static void main(String[] args) {
    
    
    // Calculator 객체 생성
    Calculator calculator = new Calculator();
      
    // Adder 객체 생성
    Adder adder = new Adder();
    
    // Calculator 객체 add 메소드 호출
    // calculator.add(adder, 10, 25);
    
    calculator.add(adder, 10, 20, 30);
    calculator.add(adder, 10, 30, 30, 40);
    calculator.add(adder, 10, 30, 30, 40, 50);
    
    //실수로 계산하고 싶어. -> 똑같은거 하나 더 만들면 된다!
    calculator.add(adder, 1.5, 2.5);
    calculator.add(adder, 1.5, 2.5, 3.5);
    calculator.add(adder, 1.5, 2.5, 3.5, 4.5);
    
  } //메소드 오버로딩 - 메소드를 다시 만든다! 언제? 인자가 다를 때.

}
