package practice03_Bus;

public class MainClass {

  public static void main(String[] args) {
    
    Person person1 = new Person("Jenny");
    
    
    Bus bus = new Bus();
    bus.addSeat(person1);
  }

}
