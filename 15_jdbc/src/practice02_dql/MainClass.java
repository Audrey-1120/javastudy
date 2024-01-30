package practice02_dql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

  public static void main(String[] args) {

    /*
     * TALK_T 테이블의 데이터를 TALK_NO의 내림차순으로 정렬한 뒤 (최근게 위로 올라오도록!)11 ~ 20번째 행을 조회하여 List에 저장하시오.
     * TALK_T 구조
     *    TALK_NO      NUMBER (PK)
     *    TALK_CONTENT VARCHAR2(1000 BYTE)
     *    TALK_USER    VARCHAR2(1000 BYTE)
     *    WRITTEN_AT   TIMESTAMP (* 현재 날짜/시간 : CURRENT_TIMESTAMP)
     * DB 서버 환경
     *    192.168.0.214
     *    GD/1111
     */
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
      
      Class.forName("oracle.jdbc.OracleDriver");
      
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      con = DriverManager.getConnection(url, user, password);
      
//      String sql = "SELECT TALK_NO, TALK_CONTENT, TALK_USER, WRITTEN_AT FROM TALK_T WHERE TALK_NO BETWEEN 7 AND 17 ORDER BY TALK_NO DESC";
     String sql = "SELECT TALK_NO, TALK_CONTENT, TALK_USER, WRITTEN_AT FROM (SELECT ROW_NUMBER() OVER(ORDER BY WRITTEN_AT DESC) AS RN, TALK_NO, TALK_CONTENT, TALK_USER, WRITTEN_AT FROM TALK_T) WHERE RN BETWEEN 11 AND 20";
      ps = con.prepareStatement(sql);
      
      rs = ps.executeQuery();
      
      List<TalkDto> users = new ArrayList<TalkDto>();
      
      while(rs.next()) {
        
        TalkDto talkDto = new TalkDto();
        talkDto.setTalk_no(rs.getInt("TALK_NO"));
        talkDto.setTalk_content(rs.getString("TALK_CONTENT"));
        talkDto.setTalk_user(rs.getString("TALK_USER"));
        talkDto.setWritten_at(rs.getDate("WRITTEN_AT"));
        
        users.add(talkDto);
      }
      
      for(int i = 0, size = users.size(); i < size; i++) {
        System.out.println(users.get(i));  
      }
      
      
      
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(rs != null) rs.close();
        if(ps != null) ps.close();
        if(con != null) con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }  
    
    
    
    
    
    
  }

}
