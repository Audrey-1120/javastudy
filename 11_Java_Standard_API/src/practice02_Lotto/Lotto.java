package practice02_Lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lotto {
  
  /**
   * 로또 구매<br>
   * 로또 구매를 위해서 사용자로부터 money를 입력 받는 메소드<br>
   * 로또 구매 비용은 최소 1000, 최대 100000이다.<br>
   * @return money   사용자가 입력한 로또 구매 비용에서 1000 미만 단위는 버리고 반환. ex) 5999 입력 시 5000 반환
   * @return 0       로또 구매 실패 시 반환
   */
  public int buyLotto() throws RuntimeException {
    
    Scanner sc = new Scanner(System.in);
    
    /* 여기에 구현 */
    
    int money = sc.nextInt();
    if(money < 1000 || money > 100000) {
      System.out.println("로또 구매 비용은 최소 1000, 최대 100000 입니다.");
    }
    // money % 1000이 0보다 크다면, 몫+1000, 0이라면 몫만 반환
    return money /= 1000 + (money % 1000 > 0 ? 1000 : 0); // 리턴 값 바꿀 것
    
  }
  
  /**
   * 로또 번호 생성<br>
   * 로또 구매 비용만큼 로또 번호를 생성하는 메소드<br>
   * 5게임씩 끊어서 생성된 로또 번호를 출력한다.<br>
   * @param money   로또 구매 비용
   */
  public List<String> generateLotto(int money) {
    
    /*
     * 예시) 5000원 구매
     * 
     * 01 : 1  2  3  4  5  6
     * 02 : 1  2  3  4  5  6
     * 03 : 1  2  3  4  5  6
     * 04 : 1  2  3  4  5  6
     * 05 : 1  2  3  4  5  6
     */
    /*
     * 예시) 10000원 구매
     * 
     * 01 : 1  2  3  4  5  6
     * 02 : 1  2  3  4  5  6
     * 03 : 1  2  3  4  5  6
     * 04 : 1  2  3  4  5  6
     * 05 : 1  2  3  4  5  6
     * 
     * 01 : 1  2  3  4  5  6
     * 02 : 1  2  3  4  5  6
     * 03 : 1  2  3  4  5  6
     * 04 : 1  2  3  4  5  6
     * 05 : 1  2  3  4  5  6
     */
    
    List<String> papers = new ArrayList<String>();
    // 로또 구매 횟수 = money / 1000
    // 만약에 20000원을 냈다고 하자. 그러면 20000 / 1000 = 20번이다. 로또는 5줄씩 한장에 출력하므로 20 / 5는 4장 = papers의 요소 개수이다.
    /*
     * money
     * 로또 한줄(lottoNum) = money / 1000
     * papers의 요소 개수 = lottoNum / 5;
     */
    
    // 1. lotto의 배열을 생성
    String[] lotto = {"1", "2", "3", "4", "5", "6"};
    
    // 2. lottoNum의 개수를 구해서 그만큼 ArraryList에 추가
    int lottoNum = money / 1000;
    for(int i = 0; i < lottoNum; i++) {
      
    }
    
    
    
    
    /* 여기에 구현 */
       
    return papers;
    
  }
  
}