package pkg08_this;

public class Computer {
  
  String model = "gram";
  int price;
  
  
  
  // this()    : 생성자를 호출하는 것
  // this.멤버 : 멤버를 호출하는 것
  Computer(){
    this(null, 0);
  }
  
  Computer(String model){
    this(model, 0);
  }
  
  Computer(String model, int price){
    this.model = model;
    this.price = price;
  }
  
  void showThis() {
    System.out.println(this);   // 현재 객체(showThis() 메소드를 호출한 객체)를 의미함.
  }
  // this : Computer 내부에서만 사용하는 전용 객체를 가리키는 키워드. computer가 this니까.... 
  
  void showModel() {
    System.out.println(this.model);
  }
  
}
