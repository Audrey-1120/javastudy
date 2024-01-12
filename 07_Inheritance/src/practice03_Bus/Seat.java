package practice03_Bus;

public class Seat {
  
  private Person person;

  public void sit(Person person) {
    this.person = person;
  }
  
  public void whatisgender() {
    person.whatisgender();
  }
  
  

}
