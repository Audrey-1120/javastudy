package pkg03_constructor;

public class Person {
  
  //field
  private String name;

  //construcotr
  public Person(String name) {
    super(); // Person은 부모가 없는데 왜 부모 생성자를 호출하고 있지 -> 사실은 있다!
    this.name = name;
  }

  //method
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  
  

}
