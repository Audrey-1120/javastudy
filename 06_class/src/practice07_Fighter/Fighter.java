package practice07_Fighter;

public class Fighter {
  
  // field
  private String name;
  private int hp;
  private int power;
  
  
  //constructor
  public Fighter() {
    
  }
  
  public Fighter(String name, int hp) {
    super();
    this.name = name;
    this.hp = hp;
  }
  
  // method

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getPower() {
    return power;
  }

  public void setPower(int power) {
    this.power = power;
  }
  
  
  /*
   * 
   * <내 풀이>
   * 
   *   public void punch(Fighter fighter, int power) {
    
    // hp가 음수이거나 0이면 메소드 종료
    if(hp <= 0 || fighter.hp <= 0) {
      return;
    }
    
    // power가 음수이거나 갖고있는 파워보다 크면 공격 실패
    if(power < 0 || this.power < power) {
      System.out.println("공격 실패 😠");
      return;
    }
    int hp = fighter.hp - power;
    fighter.setHp(hp);
    
    // 공격 결과
    if(hp <= 0) {
      System.out.println(fighter.getName() + "님이 쓰러졌습니다! die");
    } else {
      System.out.println(this.getName() + "님! 공격에 성공했습니다! " + fighter.getName()+"님의 체력 : "
                          + hp + " " + this.getName() + "님의 체력 : " + this.hp);
    }
    
    // 공격 순서
    // 1. 2의 체력에서 power만큼이 깎인다.
    // 2. 2의 체력이 0이거나 0 이하가 되면 쓰러진다. -> die 메세지
    // 3. 2의 체력이 0이상이면 공격 성공!메시지 출력
    
   * 
   */
  
  
  
  // 강사님 풀이
  // isAlive()
  public boolean isAlive() {
    return hp > 0;
  }
  
  // punch()
  public void punch(Fighter other, int power) {
    System.out.println(name + "의 펀치");
    if(power >= other.getHp()) {
      other.setHp(0);
    } else {
      other.setHp(other.getHp() - power);
    }
    System.out.println(name + "의 hp : " + hp + ", " + other.getName() + "의 hp : " + other.getHp());
  }
  
    
  }
  
  
