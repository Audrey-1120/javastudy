package pkg03_one_practice;

public class MainClass {
  
  public static void method01() {
    
    //월에 따른 계절 출력하기
    int month = 5;
    String[] seasons = new String[] {"겨울", "봄", "여름", "가을"};
    
    //코드 한줄만 추가
//    String result = month >= 3 && month <=5 ? seasons[0] : month >= 6 && month <=8 ? seasons[1] : month >= 9 && month <=11 ? seasons[2] : seasons[3];
//    System.out.println(result);
    
    System.out.println(seasons[month % 12 / 3]);
    
    /*
     * month    month % 12    month % 12 / 3
     * 12 ~ 2   0 ~ 2         0
     * 3 ~ 5    3 ~ 5         1
     * 6 ~ 8    6 ~ 8         2
     * 9 ~ 11   9 ~ 11        3
     * 
     */
    
    
  }
  
  public static void method02() {
    
    //4일은 목요일, nDay일 후는 무슨 요일?
    
    int day = 4;    //4일은 목요일
    int nDay = 4;  //nDay일 후
    String[] weekNames = new String[] {"일", "월", "화", "수", "목", "금", "토"}; //요일
    
    
    //day의 nDay일 후
    day += nDay;
    
    //코드 한줄만 추가할 것
    System.out.println(weekNames[day % 7]);
    
    
  }
  
  public static void method03() {
    
    char[] letters = new char[26]; 
    char ch = 'a';
    
    for(int i = 0; i < letters.length; i++) {
      letters[i] = ch++;
    } //A + 1은 B가 될 수도 있고, 66이 될 수도 있다.
    
    for(int i = 0; i < letters.length; i++) {
      System.out.println(letters[i]);
    }
    
    
    
  }

  public static void method04() {
    
    // 배열 a의 마지막 3개 요소를 배열 b의 값으로 수정 
    int[] a = new int[] {10, 20, 30, 0, 0, 0};
    int[] b = new int[] {40, 50, 60};
    
    
    for(int i = 0; i < b.length; i++) {
      a[i+3] = b[i];
    }
    
    /*
     * 배열 복사를 위한 자바 표준 API
     * System.arraycopy(b, 0, a, 3, b.length)
     * 1) 복사 시작 요소   : b[0] 요소를 a[3] 요소로 복사
     * 2) 복사할 요소 개수 : b.length개 만큼 복사
     */
    
    
    
    
    for(int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
    
  }
  
  public static void method05() {
    // 10진수를 2진수로 변환하기 - 이 경우 얼마나 걸리는지 알수 없기 때문에 for문 보다는 while문이 적합함
    
    // 10진수
    int number = 35;
    int i = 0;
    
    // 2진수
    int[] binary = new int[10];
    
//    for(int i=0; i<binary.length; i++) {
//      binary[i] = number % 2;
//    }
    
    //배열에 2진수 데이터 넣기
    while(number>0) {
      binary[i++] = number % 2;
      number /= 2; //number = number / 2;
    }
    
    //데이터를 1을 기준으로 거꾸로 출력.
    for(int j = i-1; j>=0; j--) {
      System.out.print(binary[j]);
    }
   
    
  }

  public static void main(String[] args) {
    method05();

    
    

  }

}
