package practice03_Bus;

public class Man extends Person {
  
  public Man() {
    super();
  }
  
  public Man(String name) {
    super(name);
  }
  
  @Override
  public void whatisgender() {
    System.out.println("저는 남자예요");
  }
 

}
