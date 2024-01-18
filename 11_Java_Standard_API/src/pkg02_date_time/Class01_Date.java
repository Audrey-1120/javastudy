package pkg02_date_time;

import java.util.Date;

import javax.xml.crypto.Data;

public class Class01_Date {

  public static void main(String[] args) {
    
    Date date1 = new Date();
    System.out.println(date1);
    
    Date date2 = new Date(1000 * 60 * 60 * 24 * 30);   // long 타입의 날짜? -> timestamp
    System.out.println(date2);
    
  }
  
}