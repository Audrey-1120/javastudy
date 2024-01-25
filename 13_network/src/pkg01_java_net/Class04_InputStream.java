package pkg01_java_net;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.management.RuntimeErrorException;

public class Class04_InputStream {

  public static void method1() {
    
    String spec = "https://www.google.com/";
    URL url = null;
    HttpURLConnection con = null;
    
    BufferedReader in = null;
    
    
    try {
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      if(con.getResponseCode() != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(spec + "접속 불가");
      }     
      in = new BufferedReader(new InputStreamReader(con.getInputStream())); 
      // con.getInputStream은 바이트 기반 스트림. 
      // InputStreamReader를 통해서 BufferedReader로 변환
      
      String line = null;
      StringBuilder builder = new StringBuilder();
      while((line = in.readLine()) != null) {
        builder.append(line).append("\n");
      }
      
      System.out.println(builder.toString());
      
      in.close();
      
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if(con != null)
        con.disconnect();
    }
    

  }

  public static void method2() {
    
    String spec = "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png";
    URL url = null;
    HttpURLConnection con = null;
    
    BufferedInputStream in = null;                                                                                                                                                         
    BufferedOutputStream out = null;
    
    try {
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      if(con.getResponseCode() != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(spec + " 접속 불가");
      }
      
      in = new BufferedInputStream(con.getInputStream());
      
      File dir = new File("\\storage");
      if(!dir.exists()) {
        dir.mkdirs();
      }
      File file = new File(dir, "google-logo.png");
      
      out = new BufferedOutputStream(new FileOutputStream(file));
      
      byte[] b = new byte[10];
      int readByte = 0;
      while((readByte = in.read(b)) != -1) {
        out.write(b, 0, readByte);
      }
      
      out.close();
      in.close();
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if(con != null)
        con.disconnect();
    }
    
  }
  
  public static void main(String[] args) {
    
  }
}
