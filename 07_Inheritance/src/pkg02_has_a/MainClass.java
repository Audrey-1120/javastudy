package pkg02_has_a;

public class MainClass {

  public static void main(String[] args) {
    
    Soldier soldier = new Soldier();
    
    for(int i = 0; i < 20; i++) {
      soldier.shoot();
    }
    
    soldier.reload(0);
    
  }

}
