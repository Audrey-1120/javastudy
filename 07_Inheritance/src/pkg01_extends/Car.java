package pkg01_extends;

public class Car {
  
  
  private String model;   // private은 자식도 못본다.
  protected String maker; // protected는 자식에서 오픈한다.
  
  
  public void forward() {
    System.out.println("앞으로");
  }

  public void reverse() {
    System.out.println("뒤로");
  }
  
  public void stop() {
    System.out.println("멈춤");
  }
  
  

}
