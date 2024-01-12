package practice03_Bus;

public class Person {
  
  //field
  private String name;
  
  //constructor
  public Person() {
    
  }
  
  public Person(String name) {
    super();
    this.name = name;
  }
  
  

  //method
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public void whatisgender() {
    System.out.println("저는 사람입니다.");
  }
  
  public void whatisname(Person person) {
    System.out.println("제 이름은" + person.getName() + "입니다.");
  }

}
