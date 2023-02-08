package back_java.반복문;

import java.util.Scanner; //입력 값 받기 위해 사용

public class gugudan{ 
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in); // 스캐너 사용
    int c =s.nextInt(); //몇번 실행할 것인지 입력받기
    int arr[]= new int[c]; //배열 생성
    for(int i =0; i<c; i++){
      int a = s.nextInt();
      int b = s.nextInt();
      arr[i]= a+b;
    }
    s.close();
    for(int k:arr){ //배열 안에 있는 값을 차례 차례 k 에 담아서 반복을 함.
      System.out.println(k);
    }
  }
}