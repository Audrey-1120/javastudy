package pkg07_terminal_method;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class MainClass {
  
  public static void method1() {
    
    // java.util.stream.Stream 생성
    Stream<String> seasons = Stream.of("spring", "summer", "autumn", "winter");
    
    // forEach() 메소드 호출
    // Stream 에 저장된 요소를 하나씩 Consumer 의 파라미터에 전달하는 메소드
    seasons.forEach( (season) -> System.out.println(season) );
    
    
  }

  public static void method2() {
    
    // 배열을 Stream 으로 만들기
    String[] seasons = {"spring", "summer", "autumn", "winter"};
    Stream<String> stream = Arrays.stream(seasons);
    
    // forEach 메소드
    stream.forEach((season) -> {
      System.out.println(season);
    });
    
  }

  public static void method3() {
    
    // Collection(List, Set) 을 Stream 으로 만들기
    
    List<String> seasons = Arrays.asList("spring", "summer", "authmn", "winter");
    Stream<String> stream = seasons.stream();
    stream.forEach((season) -> System.out.println(season));
    
    new HashSet<String>(seasons).stream()
          .forEach((season) -> System.out.println(season));
    
    
    
  }
  
  public static void main(String[] args) {
    method3();
  }

}
