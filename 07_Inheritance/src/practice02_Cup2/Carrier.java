package practice02_Cup2;

public class Carrier {
  
  private Cup[] cups;
  private int idx;
  
  public Carrier(int cupCount) {
    cups = new Cup[cupCount];
  }
  
  public void addCup(Cup cup) {
    // 캐리어가 가득찼을  때 -> 인덱스가 cups의 길이와 같거나 클때
    if(idx >= cups.length) {
      System.out.println("캐리어가 가득찼습니다.");
      return;
    }
    cups[idx++] = cup;
    System.out.println("현재 컵 : " + idx + "개 앞으로 " + (cups.length - idx) + "개 추가 가능");
  }
  
  public void whoami() {
    for(int i = 0; i < idx; i++) {
      cups[i].whoami();
    }
  }

}
