package pkg03_interface_extends;

public class MainClass {

  public static void main(String[] args) {
    
    Elec elec = new SmartPhone();
    elec.powerOn(); //타입이 Elec 이므로 elec 의 메소드만 보임.(업캐스팅)
    ((SmartPhone) elec).game();
    ((SmartPhone) elec).call();
    System.out.println();
    
    Computer computer = new SmartPhone();
    computer.powerOn();
    computer.game();
    ((SmartPhone) computer).call();
    System.out.println();
    
    Phone phone = new SmartPhone();
    phone.call();
    ((SmartPhone) phone).game();
    ((SmartPhone) phone).call();
    System.out.println();
    
    // SmartPhone의 모든 메소드를 호출하고 싶다면? -> SmartPhone 타입으로 선언하기
    SmartPhone smartPhone = new SmartPhone();
    smartPhone.powerOn();
    smartPhone.game();
    smartPhone.call();
  }

}
