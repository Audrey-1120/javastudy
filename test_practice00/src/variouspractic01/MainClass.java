package variouspractic01;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.UUID;

public class MainClass {
  
  public static void method1() {
    
    // 파일명 만들기
    // 형식 : 하이픈이 제거된 UUID + 밑줄 + 타임스탬프.확장자
    String fileName = "apple.jpg";
    
    // 하이픈이 제거된 UUID
    UUID uuid = UUID.nameUUIDFromBytes(fileName.getBytes());
    String result = uuid.toString();
    String uuidName = result.replace("-", "");
    System.out.println(uuidName);
    
    // 타임스탬프
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
    String time = formatter.format(now);
    System.out.println(time);
    
    // 확장자
    String extName2 = fileName.substring(fileName.indexOf("."));
    System.out.println(extName2);
    
    // StringBuilder로 합치기
    StringBuilder builder = new StringBuilder();
    builder.append(uuidName);
    builder.append("_");
    builder.append(time);
    builder.append(extName2);
    
    // 최종 결과 출력
    String finalResult = builder.toString();
    System.out.println(finalResult);
    

    
  }
  
  public static Map<String, Object> method2(String id) {
    
    // 나이 구하기 + 성별 구하기
    // 나이 : 현재년도 - 태어난년도
    // 성별 : 하이픈 뒤의 숫자가 1, 3이면 남, 2, 4이면 여
    
    // 나이 구하기
    // 현재 날짜 - 받은 날짜
    // 받은 날짜에서 - 앞의 단어를 가져오자! -> substring, indexOf
    int birth = Integer.parseInt(id.substring(0, id.indexOf("-")));
    int current = LocalDateTime.now().getYear();
    int age = (birth - current);
    System.out.println(age);
    
    
    
    return null;

    
  }
  
  public static void method3() {
    
    // 각 나라별 수도 맞히기
    
    // 프랑스 수도는? >>> 
    // 파리
    // 스위스 수도는? >>> 
    // 베른
    // 영국 수도는? >>> 
    // 런던
    // 독일 수도는? >>> 
    // 베를린
    // 이탈리아 수도는? >>> 
    // 로마
    // 5개 정답 성공
    
    Map<String, String> map = Map.of("프랑스", "파리"
                                   , "독일", "베를린"
                                   , "이탈리아", "로마"
                                   , "스위스", "베른"
                                   , "영국", "런던");
    

    Scanner sc = new Scanner(System.in);
    int count = 0;
    for(Entry<String, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + "의 수도는? >>> ");
      String capital = sc.next();
      if(capital.equals(entry.getValue())){
        count++;
    }
  }
    System.out.println(count + "개 정답 성공!");
    sc.close();
    

  }
  
  
  public static void method4() {

    // 5000원이 있는 통장(balance)에서 랜덤하게 출금하기
    // 실행예시)
    // 출금 전 5000원, 1회 출금액 2917원, 출금 후 2083원
    // 출금 전 2083원, 2회 출금액 1961원, 출금 후 122원
    // 출금 전 122원, 3회 출금액 102원, 출금 후 20원
    // 출금 전 20원, 4회 출금액 2원, 출금 후 18원
    // 출금 전 18원, 5회 출금액 17원, 출금 후 1원
    // 출금 전 1원, 6회 출금액 1원, 출금 후 0원
    
    /*
     * 출금액 -> Math.random으로 난수 생성 => 이때 금액은 0 ~ 남은금액
     * 
     */
    
    // 내코드
//    int balance = 5000;
//    
//    
//    while(balance > 0) {
//      System.out.println("출금 전 : " + balance);
//      int withdraw = (int)(Math.random() * balance + 1);
//      System.out.println("출금액 : " + withdraw);
//      balance -= withdraw;
//      System.out.println("출금 후 : " + balance);
//      System.out.println();
//      
//      if(balance < 0) {
//        break;
//      }
//    }
    
    // 강사님 코드
    int balance = 5000;
    int count = 0;
    while(balance > 0) {
      
      int money = (int)(Math.random() * balance + 1);
      count++;
      System.out.println("출금 전 " + balance + "원, " + count + "회 출금액 " + money + "원, 출금 후 " + (balance -= money) + "원");
      
    }
    
    
    
    
  
  }
  
  public static void method5() {
    
    /*
     * yuts의 요소 개수는 모두 6개이다.
     * 윷을 한번 던지면 랜덤 요소 1개가 나온다.
     * 몇번을 던질지는 사용자가 정한다. -> Scanner로 던지는 횟수 받기 = count
     * 횟수가 정해지면 그 횟수만큼 랜덤 난수를 생성한다. 범위는? -> 0~5 = yutNum
     * switch 문을 사용해서 나온 조건마다 몇칸 이동하는지 더한다. -> move
     * 출력
     */

    // 윷놀이
    // 실행예시1) "도", 1칸 이동한다.
    // 실행예시2) "개", 2칸 이동한다.
    // 실행예시3) "걸", 3칸 이동한다.
    // 실행예시4) "윷", "도", 5칸 이동한다.
    // 실행예시5) "모", "윷", "도", 10칸 이동한다.
    
    String[] yuts = {"", "도", "개", "걸", "윷", "모"};
    

    // 내 코드
//    Scanner sc = new Scanner(System.in);
//    System.out.print("몇번 던질까요? >>>");
//    int count = sc.nextInt();
//    int move = 0;
//    
//    for(int i = 1; i <= count; i++) {
//      int yutNum = (int)(Math.random()*5 + 1);
//      System.out.print(yuts[yutNum]);
//      
//      switch(yutNum) {
//      case 1: move += 1;
//      case 2: move += 2;
//      case 3: move += 3;
//      case 4: move += 4;
//      case 5: move += 5;
//      default: move += 0;
//      }
//    }
//    
//    System.out.println(move+"칸 이동한다.");
    
    
    // 강사님 코드
    StringBuilder builder = new StringBuilder();
    int move = 0;
    int totalMove = 0;
    do {
      move = (int)(Math.random() * 5 + 1); // 윷 던지는 코드
      totalMove += move;
      builder.append(yuts[move]);
      builder.append(",");
    } while(move >= 4);
    builder.append(totalMove).append("칸 이동한다.");
    
    System.out.println(builder.toString());

    
  }
  
  public static void method6() {
    
    // SecureRandom을 이용해 "대문자+소문자+숫자"로 구성된 임의의 인증번호 만들기
    // 실행예시1)
    //   몇 자리의 인증번호를 생성할까요? >>> 4
    //   생성된 4자리 인증번호는 7W5e입니다.
    // 실행예시2)
    //   몇 자리의 인증번호를 생성할까요? >>> 6
    //   생성된 6자리 인증번호는 Fa013b입니다.
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("몇 자리의 인증번호를 생성할까요? >>> ");
    int pLength = sc.nextInt();
    
    String result = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
    
    SecureRandom secureRandom = new SecureRandom();
    
    StringBuilder builder = new StringBuilder();
    
    for(int i = 0; i<pLength; i++) {
      int ranIndex = secureRandom.nextInt(result.length());
      char ranChar = result.charAt(ranIndex);
      builder.append(ranChar);
    }
    
    System.out.println("생성된 " + pLength + "자리 비밀번호는 " + builder.toString() + "입니다.");
    
    
    
    
    
    

  }

  public static void method7() {

    // UpDown 게임
    // 컴퓨터가 1 ~ 10000 사이의 난수를 발생시킨다.
    // 사용자는 해당 난수를 맞힌다.
    // 실행예시)
    // 입력 >>> 5000
    // Down!
    // 입력 >>> 2500
    // Up!
    // ...
    // 입력 >>> 4500
    // 정답입니다. 총 5번만에 성공했습니다.
    
    System.out.println("UpDown 게임을 해봅시다!");
    int answer = (int)(Math.random() * 10000 + 1);
    
    Scanner sc = new Scanner(System.in);
    int count = 0;
    
    while(true) {
      
      System.out.print("입력 >>> ");
      int user = sc.nextInt();
      
      if(user == answer) {
        System.out.println("정답입니다! 총 " + count + "번 만에 성공했습니다!");
        return;
      } else if(user < answer) {
        System.out.println("Up!");
        count++;
      } else {
        System.out.println("down!");
        count++;
      }
    }

    
  }

  public static void method8() {

    // 0~9 사이 난수를 100개 발생시키고 발생한 난수들이 생성된 횟수(빈도수)를 그래프화 하여 출력하시오.
    // 실행예시)
    // 0 : #### 4
    // 1 : ############ 12
    // 2 : ############ 12
    // 3 : ##### 5
    // 4 : ######## 8
    // 5 : ########### 11
    // 6 : ############ 12
    // 7 : ################## 18
    // 8 : ####### 7
    // 9 : ########### 11
    
    /*
     * 그래프? count변수를 선언해서 for문을 돌린다.
     * i가 0에서 9까지 갈동안, 난수를 담은 배열의 요소와 순서대로 하나씩 비교해서 같으면 count 변수에 1을 더한다.
     * 최종 count 수 만큼 #을 출력하고 다음 1로 넘어간다.
     */
    
    // 배열 선언하고 난수 100까지 발생시켜서 값 대입
    int[] arr = new int[100];
    for(int i = 0, size = arr.length; i < size; i++ ) {
      arr[i] += (int)(Math.random() * 10);
    }
    
    // 발생한 난수들이 생성된 횟수 세기
    int count = 0;
    for(int i = 0; i < 10; i++) {
      count = 0;
      System.out.print(i + " : ");
      for(int j = 0, size = arr.length; j < size; j++) {
        if(arr[j] == i) {
          System.out.print("#");
          count += 1;
        }
      }
      System.out.println(" " + count);
      System.out.println();
    }
    
    
  }
  
  public static void method9() {
    
    // 5 x 5 숫자 빙고판 자동 생성
    //
    // 지시사항)
    //   1. 1 ~ 25 사이 정수를 2차원 배열 bingo 에 순차적으로 넣는다.
    //      1  2  3  4  5
    //      6  7  8  9 10
    //     11 12 13 14 15
    //     16 17 18 19 20
    //     21 22 23 24 25
    //   2. 25번 서로 섞는다.
    //      순차적으로        랜덤하게
    //      모든요소접근      접근
    //      ----------------------------
    //      bingo[0][0]  <->  bingo[1][4]
    //      bingo[0][1]  <->  bingo[0][2]
    //      bingo[0][2]  <->  bingo[2][1]
    //      ...
    //      bingo[4][4]  <->  bingo[3][1]
    //
    // 실행예시)
    //  10  9  4 25  2
    //  15  3 13 21  1
    //  14 20 11 19  6
    //   8 17  5 12  7
    //  16 22 18 24 23
    
    
    // 내 풀이
    int[][] bingo = new int[5][5];
    int num = 1;
    
    // 1 ~ 25 사이 정수를 2차원 배열 bingo 에 순차적으로 넣기
    for(int i = 0; i < bingo.length; i++) {
      for(int j = 0; j < bingo[i].length; j++) {
        bingo[i][j] = num++;
        System.out.print(String.format("%3d", bingo[i][j]));
      }
      System.out.println();
    }
    
    System.out.println();
    
    // 순차적으로 접근해서 랜덤하게 접근한 요소와 섞는다.
    // 이때 중복 처리를 해준다.
    for(int i = 0; i < bingo.length; i++) {
      for(int j = 0; j < bingo[i].length; j++) {
        int temp1 = (int)(Math.random()*25 + 1);
        bingo[i][j] = temp1;
        System.out.print(String.format("%3d", bingo[i][j]));
      }
      System.out.println();
    }
    
    
    
  }
  

  public static void main(String[] args) {
    method9();
//    Map<String, Object> map = method2("140101-3123456");
    // map을 for문으로 돌려서 확인하기 
    
  }

}
