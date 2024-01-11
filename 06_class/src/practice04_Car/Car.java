package practice04_Car;

public class Car {
  
  
  // field
  private Driver driver;
  private int currSpeed;
  private int fuel;
  public final static int MAX_SPEED = 100;
  
  // constructor
  public Car() {
    
  }

  public Car(Driver driver, int currSpeed, int fuel) {
    super();
    this.driver = driver;
    this.currSpeed = currSpeed;
    this.fuel = fuel;
  }
  
  // method

  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public int getCurrSpeed() {
    return currSpeed;
  }

  public void setCurrSpeed(int currSpeed) {
    this.currSpeed = currSpeed;
  }

  public int getFuel() {
    return fuel;
  }

  public void setFuel(int fuel) {
    this.fuel = fuel;
  }
  
  public void enginStart() {
    if(driver == null || fuel == 0) {
      System.out.println("시동 실패");
    } else {
      System.out.println("시동 성공");
    }
  }
  
  // 1초당 n씩 속도가 증가하는 accelerator(n : bestDriver는 10, 아니면 5)
  // 1초당 1씩 연료가 줄어드는 accelerator
  
  public void accelerator(int pushTime) {
    
    // currSpeed가 이미 MAX_SPEED라면? 더 이상 증가할 일 없음.
    if(currSpeed == MAX_SPEED) {
      System.out.println("이미 최고 속도입니다.");
      return;
    }
    
    // fuel이 0이라면? 연료가 없으므로 속도 증가 X
    if(fuel == 0) {
      System.out.println("연료가 없습니다.");
      return;
    }
    
    // pushTime이 0이라면?
    if(pushTime <= 0) {
      System.out.println("accelerator를 잘 밟으세요.");
      return;
    }
    
    int n = driver.isBestDriver() ? 10 : 5;
    currSpeed += (pushTime * n);
    currSpeed = Math.min(currSpeed, MAX_SPEED);
    
    fuel -= pushTime;
    // fuel값이 0보다 작으면 0으로, 0보다 크면 fuel 값으로.
    fuel = Math.max(fuel, 0);
    
    System.out.println("현재 연료량 : " + fuel + ", 현재 속도 : " + currSpeed);
    
    
  }

  // 1초당 10씩 속도가 줄어드는 brake
  public void brake(int pushTime) {
    
    if(currSpeed == 0) {
      System.out.println("이미 멈춰있습니다.");
      return;
    }
    
    if(pushTime <= 0) {
      System.out.println("Brake를 잘 밟으세요.");
    }
    
    currSpeed -= (pushTime * 10);
    currSpeed = Math.max(currSpeed, 0);
    
    System.out.println("현재 연료량 : " + fuel + ", 현재 속도 : " + currSpeed);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

}
