package pkg06_practice;

public class MainClass {

  public static void method1() {

  }
  
  public static void method2() {
    
  }
  
  public static void method3() {
    
    // 점수가 90점대이면 true 아니면 false
    int score = 75;
    
    
    // 90점 이상 그리고 100점 미만
    boolean result1 = score >= 90 && score < 100;
    System.out.println(result1);
    
    // 10으로 나눈 몫이 9인 수
    boolean result2 = (score / 10) == 9;
    System.out.println(result2);
    
    
    if(score>=90 && score<100) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
    
  }
  
  public static void method4() {
    
    // 짝수/홀수 판단
    // 짝수 : 2로 나눈 나머지가 0인 수
    // 홀수 : 2로 나눈 나머지가 1인 수
    
    int n = 6;
    if(n%2==0) {
      System.out.println("짝수입니다.");
    } else {
      System.out.println("홀수입니다.");
    }
    
  }
  
  public static void main(String[] args) {
    method3();
    method4();
  }

}
