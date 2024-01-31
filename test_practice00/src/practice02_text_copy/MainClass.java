package practice02_text_copy;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MainClass {

  public static void main(String[] args) {

    File src = new File("\\Program Files\\Java\\jdk-17\\LICENSE");
    File dest = new File("\\Storage\\LISENSE\\");
    
    MyFileUtils.fileCopy(src, dest);
    
    
    
    
    /*
     * 내 코드
    MyFileUtils.fileCopy(new File("\\Program Files\\Java\\jdk-17\\LICENSE")
                       , new File("\\Storage\\LISENSE\\"));
    
    MyFileUtils.fileMove(new File("\\Storage\\LISENSE\\")
                       , new File("\\GDJ77\\LISENSE\\"));
    */
  }

}
