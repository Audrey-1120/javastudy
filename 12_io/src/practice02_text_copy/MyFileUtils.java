package practice02_text_copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileUtils {

  public static void fileCopy(File src, File dest) {
    
    
    // BufferedReader : File src 읽는 역할
    // BufferedWriter : File dest 만드는 역할
    
    try(BufferedReader in = new BufferedReader(new FileReader(src));
        BufferedWriter out = new BufferedWriter(new FileWriter(dest))) {
      
      char[] cbuf = new char[256];
      int readChar = 0;
      
      // in.read(cbuf) -> out.write(cbuf)
      while((readChar = in.read(cbuf)) != -1 ) {
        out.write(cbuf, 0, readChar);
      }
      
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    
    
    
    
    /*
     * 내 코드
     * 
    // 입출력 스트림 - 문자
    File srcFile = src;
    File destFile = dest;
    
    // 버퍼 입출력 스트림 선언
    BufferedReader in = null;
    BufferedWriter out = null;
    
    try {
      
      // 버퍼 입출력 스트림 생성
      in = new BufferedReader(new FileReader(srcFile));
      out = new BufferedWriter(new FileWriter(destFile));
      
      
      // 읽는 단위
      String line = null;
      
      // 읽기
      while((line = in.readLine()) != null) {
        out.write(line);
      }
      
      in.close();
      out.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    */
    
    
    
  }
  
  public static void fileMove(File src, File dest) {
    
    fileCopy(src, dest);
    src.delete();
    
  }
  
}
