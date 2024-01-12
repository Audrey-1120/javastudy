package practice03_Bus;

public class Bus {
  
  public final static int MAX_SEAT = 25; // 버스는 25인승
  private Person[] seats; 
  private int idx;

  public Bus() { //이미 MAX_SEAT는 정해져 있으므로...
    
  }
  
  public void addSeat(Person person) {
    // 좌석이 가득 찼을 때
    if(idx >= MAX_SEAT) {
      System.out.println("좌석이 다 찼습니다.");
      return;
    }
    
    // 각 Seat에 Man과 Woman 저장하기.
    seats[idx++] = person;
    System.out.println(person.getName() + "님의 현재 예약된 자리 : " + idx + "자리 입니다. 남은 자리는 "
                         + (MAX_SEAT - idx) + "자리 입니다.");

  }
  
  // 승객 성별 확인
  public void whoareyou() {
    for(int i = 0; i < idx; i++) {
      seats[i].whatisgender();
    }
  }

  
}
