package back_java.조건문;

import java.util.Scanner;


public class test_2525 {
  public static void main(String[] args){
     Scanner s = new Scanner(System.in); // 스캐너 사용

     //next() : 공백을 기준으로 한 단어 또는 한 문자씩 입력받는다
     // 개행 문자를 가져오지 않음
     int A = s.nextInt(); //시간 
     int B = s.nextInt(); //분
     int time = s.nextInt(); //요리하는데 필요한 시간
     
     int min = B+ time;
     
     if (min>60){
      A= min/60 + A;
      min = min%60;
     }
     if(A>=24){
      A= A-24;
     }
     System.out.println(A+" "+min);
     s.close();
  }
}
