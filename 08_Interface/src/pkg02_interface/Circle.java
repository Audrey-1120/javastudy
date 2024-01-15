package pkg02_interface;
/*
 * 용어 비교
 *    클래스            인터페이스
 * 1. 상속한다.         구현한다.
 * 2. extends           implements
 * 3. 자식클래스        구현클래스
 */

public class Circle implements Shape{
  
  //field
  private double x;
  private double y;
  private double radius;
  
  //constructor
  public Circle() {
    //super(); Shape() 생성자 호출, 디폴트 생성자는 호출을 생략할 수 있다.
  }

  public Circle(double x, double y, double radius) { 
    this.x = x;
    this.y = y;
    this.radius = radius;
  }
  
  //method
  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
  
  

  @Override
  public double getArea() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public double getCircum() {
    // TODO Auto-generated method stub
    return 0;
  }
  
  

}
