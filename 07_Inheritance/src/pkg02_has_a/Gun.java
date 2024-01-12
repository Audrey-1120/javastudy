package pkg02_has_a;

public class Gun {
  
  public final static int MAX_BULLET = 20;
  private int bullet;
  
  public Gun() {
    bullet = 10;
  }

  public int getBullet() {
    return bullet;
  }

  public void setBullet(int bullet) {
    this.bullet = bullet;
  }
  
  public void shoot() {
    if(bullet == 0) {
      System.out.println("총알이 없습니다.");
      return;
    }
    
    System.out.println("빵야! 현재 총알 : " + --bullet + "개");
  }
  
  
  public void reload(int bullet) {
    if(bullet <= 0) {
      System.out.println("정상적으로 총알을 넣어주세요.");
      return;
    }
    
    if(this.bullet + bullet > MAX_BULLET) {
      System.out.println("총알이 너무 많습니다.");
    }
    
    this.bullet += bullet;
    System.out.println(bullet + "발 장전 완료 😊 현재 " + this.bullet + "발 있음.");
    
    
  }
  
  

}
