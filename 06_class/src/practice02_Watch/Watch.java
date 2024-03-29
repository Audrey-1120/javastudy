package practice02_Watch;

public class Watch {
  
  private int hour;
  private int minute;
  private int second;
  
  public Watch(int hour, int minute, int second) {
    super();
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }
  
  
  public void addHour(int hour) {
    if(hour <= 0) {
      return;
    }
    this.hour += hour;
    this.hour %= 24;
  }
  
  public void addMinute(int minute) {
    if(minute <= 0) {
      return;
    }
    this.minute += minute;
    addHour(this.minute/60);
    this.minute %= 60;
  }
  
  
  public void addSecond(int second) {
    if(second <= 0) {
      return;
    }
    this.second += second;
    addMinute(this.second/60);
    this.second %= 60;
  }

  public void see() {
//    System.out.println("현재 시각은 " + hour + "시" + minute + "분" + second + "초 입니다.");
    System.out.println(String.format("%02d:%02d:%02d", hour, minute, second));
  }
  
  
  
  
  // 내가 쓴 답변
  
//  public void addHour(int hour) {
//    if(hour <= 0) {
//      return;
//    }
//
//    hour += time;
//    if(hour > 24) {
//      hour -= 24;
//      return;
//    }
//  }
//  
//  public void addMinute(int time) {
//    if(minute+time > 60) {
//      this.addHour((minute+time)/60);
//      minute += (minute+time)%60;
//      return;
//    }
//    
//  }
//  
//  public void addSecond(int time) {
//    if(second+time > 60) {
//      this.addHour((second+time/3600));
//      this.addMinute((second+time/60));
//      second += second+time/3600;
//    }
    
  }
  
  
  
  


