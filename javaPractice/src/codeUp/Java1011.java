package codeUp;

import java.util.Scanner;

public class Java1011 {

  public static void main(String[] args) {
    
   //1부터 1씩 증가하여 정수로 입력한 수까지의 3의 배수이면서
   //4의 배수인 수를 출력하고 개수와 합계를 출력하시오.

    int a = 0;
    int sum = 0, count = 0;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("정수를 입력하세요>> ");
    a = sc.nextInt();
    
    for(int i=1; i<=a; i++) {
      if(i%3==0 && i%4==0) {
        System.out.println("해당 숫자는 " + i + " 입니다.");
        sum += i;
        count++;
      }
    }
    
    System.out.println("개수는" + count + "개, 합계는 " + sum);
    
    
    
    
  }

}
