package codeUp;

import java.util.Scanner;

public class Java1010 {
  

  public static void main(String[] args) {
    
    //정수를 입력하여 1부터 1씩 증가하여 입력한 수까지의 정수 중에서
    //홀수를 출력하고 그 홀수의 개수와 합계를 출력하시오.
    
    Scanner sc = new Scanner(System.in);
    System.out.print("정수를 입력하세요 >> ");
    int a = sc.nextInt();
    int count = 0;
    int sum = 0;
    
    for(int i=1; i<=a; i++) {
      if(i%2!=0) {
        System.out.println("입력한 값은 홀수입니다.");
        sum += i;
        count++;
      }
    }
    
    System.out.println("홀수의 개수는 " + count + "개 입니다.");
    System.out.println("홀수의 합계는 " + sum + "입니다.");
    
    sc.close();
    

    
  }
}
