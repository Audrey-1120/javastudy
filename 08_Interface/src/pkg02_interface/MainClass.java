package pkg02_interface;

public class MainClass {

  public static void main(String[] args) {
    
    // Circle
    
    // 구현 클래스 생성
    Shape shape1 = new Circle(0, 0, 1.5);
    
    // 추상 메소드
    System.out.println(shape1.getArea());
    System.out.println(shape1.getCircum());
    
    // 디폴트 메소드 (구현클래스 타입의 객체로 호출 가능)
    shape1.whoami("원");
    
    // 클래스 메소드
    Shape.whoami2("원");
    
    // Rectangle
    
    // 구현 클래스 생성
    Shape shape2 = new Rectangle(0, 0, 2, 2);
    
    // 추상 메소드
    System.out.println(shape2.getArea());
    System.out.println(shape2.getCircum());
    
    // 디폴트 메소드
    shape2.whoami("네모");
    
    // 클래스 메소드
    Shape.whoami2("네모");
    
    
    
    
  }

}
