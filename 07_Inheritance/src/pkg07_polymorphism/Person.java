package pkg07_polymorphism;


public class Person {
  
//만약 파라미터에 new Tv()와 new Radio()를 동시에 전달하고 싶으면? -> Elec elec
  public void powerOn(Elec elec) {  // Elec elec = new Tv() 또는 Elec elec = new Radio()
    // << upcasting
    // Elec elec = new Tv();
    // elec elec = new Radio();
    

    
    /*
     * 1. 다운캐스팅으로 powerOn() 호출하기 -> 전자제품이 추가될때마다 코드의 추가가 필요하므로 추천하지 않는다.
     * if(elec instanceof Tv) { 
     *   ((Tv) elec).powerOn();
     * }
     * else if(elec instanceof Radio) {
     *   ((Radio) elec).powerOn();
     * }
     * 
     */
    
    /*
     * 2. Elec 에 powerOn() 메소드를 추가하고 Tv 나 Radio 가 오버라이드하기
     */
    
    elec.powerOn(); // 지금 업캐스팅 했으니까 부모 클래스의 메소드만 사용 가능해 -> 그러면 powerOn()메소드를 부모 클래스(Elec)에 넣자!
    
    
    
    
    
    
    
    
    
    
  }

}
