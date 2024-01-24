package practice01_byte_copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileUtils {

  // 파일 복사 메소드
  public static void fileCopy(String src, String dest) {
    
    // 입력부터 시작
    File srcFile = new File(src);
    
    // 출력 파일 생성
    File destFile = new File(dest);
    
    // 입력 스트림 선언
    BufferedInputStream in = null;
    
    // 출력 스트림 선언
    BufferedOutputStream out = null;
    
    try {
      
      // 입력 스트림 생성
      in = new BufferedInputStream(new FileInputStream(srcFile));
      
      // 출력 스트림 생성
      out = new BufferedOutputStream(new FileOutputStream(destFile));      
      
      // 5바이트씩 읽어오기
      byte[] bytes = new byte[5];
      
      // 입력값 읽어오기 시작
      int readByte = 0;
      while((readByte = in.read(bytes)) != -1) {
        out.write(bytes, 0, readByte);
      }
      
      out.close();
      
      in.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  // 파일 이동 메소드
  public static void fileMove(String src, String dest) {
    
    fileCopy(src, dest);
    new File(src).delete();
    
    
  }
  
}