package pkg02_open_api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainClass {

  public static void main(String[] args) {
    
    // 해당 주소는 서비스 URL이 아니라 요청주소.
    StringBuilder builder = new StringBuilder();
    builder.append("http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath");
    
    // 인증키의 항목명인serviceKey. 뒤에는 내 인증키!
    builder.append("?serviceKey=").append("8qXryYQzWCQYOX%2FXCfybXEZ5pFThPA3PmXZFQ9iPt1tTdL2EzbP7y32w46vBQntgd4WAEgl8U9dHeGSKa%2FNvfw%3D%3D");
    
    // 년도? 2023
    builder.append("&searchYear=").append(2022);
    
    // 시도? 서울
    builder.append("&siDo=").append(1100);
    
    // 금천구 선택
    builder.append("&guGun=").append(1125);
    
    // 타입은 XML 말고 JSON으로 하기
    builder.append("&type=").append("json");
    
    builder.append("&numOfRows=").append(10);
    
    builder.append("&pageNo=").append(1);
    
    String spec = builder.toString();
    URL url = null;
    HttpURLConnection con = null;
    
    BufferedReader in = null;
    
    try {
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      if(con.getResponseCode() != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException("API 요청 실패");
      }
      
      in = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      StringBuilder sb = new StringBuilder();
      String line = null;
      while((line = in.readLine()) != null) {
        sb.append(line);
      }
      
      System.out.println(sb.toString());
      
      in.close();
      
      
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    
  }

}
