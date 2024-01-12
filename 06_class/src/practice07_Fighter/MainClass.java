package practice07_Fighter;

public class MainClass {

  public static void main(String[] args) {
    
    Fighter fighter1 = new Fighter("chunlee", 100);
    
    Fighter fighter2 = new Fighter("ryu", 100);
    
    boolean myTurn = true;
    
    while(fighter1.isAlive() && fighter2.isAlive())
    {
      
      if(myTurn) {
        fighter1.punch(fighter2, 20);
      } else {
        fighter2.punch(fighter1, 10);
      }
      
      myTurn = !myTurn;
    
    }
    
    
  }

}
