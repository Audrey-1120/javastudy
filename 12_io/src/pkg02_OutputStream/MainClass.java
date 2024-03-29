package pkg02_OutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class MainClass {
  
  /*
   * java.io.FileOutPutStream
   * 1. 바이트 기반의 파일 출력 스트림
   * 2. 출력 단위
   *    1) int
   *    2) byte[]
   */
  
  /*
   * java.io.BufferedOutputStream
   * 1. 버퍼링을 지원하는 바이트 출력 스트림이다.
   * 2. 보조 스트림으로 메인 스트림과 함께 사용해야 한다.
   * 3. 버퍼링을 지원하므로 출력 속도가 향상된다.
   */
  
  /*
   * java.io.DataOutputStream
   * 1. 자바 변수 값을 출력하는 바이트 출력 스트림이다.
   * 2. 보조 스트림으로 메인 스트림과 함께 사용해야 한다.
   * 3. 타입 별로 전용 메소드가 존재한다.
   */
  
  /*
   * java.io.ObjectOutputStream
   * 1. 객체를 출력하는 바이트 출력 스트림이다.
   * 2. 보조 스트림으로 메인 스트림과 함께 사용해야 한다.
   * 3. 객체를 출력 스트림으로 전송하기 위해서는 직렬화 과정이 필요하다.
   * 4. 직렬화 방법
   *    1) 직렬화할 클래스는 java.io.Serializable 인터페이스를 구현한다. (필수)
   *    2) long serialVersionUID 필드 값을 임의로 생성한다.
   */
  
  public static void method1() {
    
    // 무조건 생성 모드 : 기존에 파일이 있으면 지우고 다시 만든다.
    
    // 디렉터리
    File dir= new File("\\Storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일
    File file = new File(dir, "sample1.dat");
    
    // 파일 출력 스트림 선언
    FileOutputStream out = null;
    
    try {
      
      // 파일 출력 스트림 생성 (무조건 생성 모드)
      out = new FileOutputStream(file);
      
      // 출력할 데이터
      int c = 'A';
      String str = "pple";
      byte[] b = str.getBytes();
      
      // 출력
      // write는 기본적으로 IOException을 던짐.
      out.write(c);
      out.write(b);
      
      // 플러싱(선택) -> 스트림에 남아있는 데이터(전달되지 않았음)가 있다면 내보내라!
      out.flush();
      
      // 확인
      System.out.println(file.length() + "바이트 크기의 " + file.getPath() + "파일이 생성되었습니다.");
      
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      
      try {
        // 파일 출력 스트림 닫기(종료)
        if(out != null)
        out.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
      
    }
    
  }

  public static void method2() {
    
    // 추가 모드 : 기존에 파일이 없으면 새로 만들고 있으면 내용만 추가한다.
    

    // 디렉터리
    File dir= new File("\\Storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일
    File file = new File(dir, "sample2.dat");
    
    // 파일 출력 스트림 선언
    FileOutputStream out = null;
    
    try {
      
      // 파일 출력 스트림 생성 (추가 모드)
      out = new FileOutputStream(file, true);
      
      // 출력할 데이터
      String str = "안녕하세요 반갑습니다\n";
      byte[] b = str.getBytes();
      
      // 출력
      out.write(b);
      
      // 플러싱(선택)
      out.flush();
      
      // 확인
      System.out.println(file.length() + "바이트 크기의 " + file.getPath() + "파일이 생성되었습니다.");
      
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      
      try {
        // 파일 출력 스트림 닫기(종료)
        if(out != null)
        out.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
      
    }
    

    
  }
  
  public static void method3() {
    
    File dir = new File("\\Storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "sample3.dat");
    
    
    // 버퍼 출력 스트림
    BufferedOutputStream out = null;
    
    try {
      
      // 버퍼 출력 스트림 생성
      out = new BufferedOutputStream(new FileOutputStream(file));
      
      // 출력할 데이터
      String str1 = "how do you do? nice to meet you\n";
      String str2 = "i'm fine thank you";
      
      // 출력
      out.write(str1.getBytes());
      out.write(str2.getBytes());
      
      // 버퍼 출력 스트림 닫기
      out.close();
      
      // 확인
      System.out.println(file.length() + "크기의 " + file.getPath() + "파일이 생성되었습니다.");
      
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }

  public static void method4() {
    
    File dir = new File("\\Storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "sample4.dat");
    
    // 데이터 출력 스트림 선언
    DataOutputStream out = null;
    
    try {
      
      
      // 데이터 출력 스트림 생성
      out = new DataOutputStream(new FileOutputStream(file));
      
      // 출력할 데이터
      String name = "김진수";
      int age = 10;
      double height = 140.5;
      boolean isAdult = (age >= 20);
      char gender = '남';
      
      // 출력
      out.writeUTF(name);
      out.writeInt(age);
      out.writeDouble(height);
      out.writeBoolean(isAdult);
      out.writeChar(gender);
      
      // 데이터 출력 스트림 닫기
      out.close();
      
      // 확인
      System.out.println(file.length() + "크기의 " + file.getPath() + "파일이 생성되었습니다.");
      
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    
  }
  
  public static void method5() {
    
    File dir = new File("\\Storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "sample5.dat");
    
    // 객체 출력 스트림 선언
    ObjectOutputStream out = null;
    
    try {
      
      // 객체 출력 스트림 생성
      out = new ObjectOutputStream(new FileOutputStream(file));
      
      // 출력할 객체
      Employee employee = new Employee(1, "김채원");
      List<Employee> employees = Arrays.asList(new Employee(2, "허윤진"), new Employee(3, "카즈하"));
      
      // 객체 출력
      out.writeObject(employee);
      out.writeObject(employees);
      
      // 객체 출력 스트림 닫기
      out.close();
      
      // 확인
      System.out.println(file.length() + "크기의 " + file.getPath() + "파일이 생성되었습니다.");
      
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
  
  
  public static void main(String[] args) {
    method5();
  }
  
  
  public static void practice1() {
    
    // FileOutputStream으로 애국가 1절 파일로 보내기: 시간 재기(System.nanoTime())
    
    long start = System.nanoTime();
    File dir = new File("\\Storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일
    File file = new File(dir, "korea.dat");
    
    // 파일 출력 스트림 선언
    FileOutputStream out = null;
    
    try {
      
      // 파일 출력 스트림 생성 (추가 모드)
      out = new FileOutputStream(file, true);
      
      // 출력할 데이터
      String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리 나라 만세 \n 무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세";
      byte[] b = str.getBytes();
      
      // 출력
      out.write(b);
      
      // 플러싱
      out.flush();
      
      // 확인
      System.out.println(file.length() + "바이트 크기의 " + file.getPath() + "파일이 생성되었습니다.");
      
      
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      
      try {
        // 파일 출력 스트림 닫기(종료)
        if(out != null)
        out.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
      
    }
    
    long end = System.nanoTime();
    System.out.println("파일 출력 스트림의 속도는 "+ (end - start) + "ns");
    
    
    
    
  }
  
  public static void practice2() {
    
    
    long start = System.nanoTime();
    // BufferedOutputStream으로 애국가 1절 파일로 보내기: 시간 재기
    File dir = new File("\\Storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "korea2.dat");
    
    // 버퍼 출력 스트림
    BufferedOutputStream out = null;
    
    try {
      
      // 버퍼 출력 스트림 생성
      out = new BufferedOutputStream(new FileOutputStream(file));
      
      // 출력할 데이터
      String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리 나라 만세 \n 무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세";
      
      // 출력
      out.write(str.getBytes());
      
      // 버퍼 출력 스트림 닫기
      out.close();
      
      // 확인
      System.out.println(file.length() + "크기의 " + file.getPath() + "파일이 생성되었습니다.");
      
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    long end = System.nanoTime();
    System.out.println("버퍼 출력 스트림의 속도는 "+ (end - start) + "ns");
    
  }
  
  
  

}
