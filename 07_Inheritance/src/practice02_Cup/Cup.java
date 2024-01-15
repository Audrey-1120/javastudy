package practice02_Cup;

public class Cup {
  
  private Coffee coffee; // Coffee 타입의 coffee를 필드로 가짐.
  
  public void fill(Coffee coffee) { // 이 메소드는 setter이다.
    this.coffee = coffee; //coffee를 인자값으로 받아서 해당 객체의 coffee값을 바꾼다.
  }
  
  public void whoami() {
    coffee.whoami();
  }

}
