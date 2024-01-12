package practice02_Cup;

public class Cup {
  
  private Coffee coffee;
  
  public void fill(Coffee coffee) { // 이 메소드는 setter이다.
    this.coffee = coffee;
  }
  
  public void whoami() {
    coffee.whoami();
  }

}
