package back_java.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

//가변 길이 배열 (Jagged Array)
//배열의 마지막 차수의 크기를 지정하지 않고 가변적으로 생성 

//단어 사전순 메소드 : compareTo() 사용

// 길이가 짧은 순으로 
// 길이가 같으면 사전 순으로

//compare를 오버라이딩하여 정렬 재정의
//재정의한 후 ArrayList 를 하나 더 만들어 중복 제거 후 출력 (treeset 사용법도 같이 익혀두기)

public class test_1181 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    int n = Integer.parseInt(bf.readLine());
    String [] arr = new String[n];

    for(int i=0; i<n; i++){
      arr[i] = bf.readLine(); //배열에 문자 한 칸씩 넣기
    }
    
    //여기가 완전 개처음 보는 구간인디
    //알고리즘 흐름
    //입력받기 -> 순서대로 정렬 -> 중복제거 -> 출력

    Arrays.sort(arr, new Comparator<String>() {
      @Override
      public int compare(String s1,String s2){
        //길이가 같다면 사전순으로 정렬
        if(s1.length() == s2.length()){
          return s1.compareTo(s2);
        }
        //길이가 다르다면 리턴 값이 양수일 경우 바뀌고 음수이면 x
        //해당 메서드가 리턴값을 양수인지 음수인지 판별하기 때문에
        //이렇게만 적어도 됨
        else{
          return s1.length() - s2.length();
        }
      }
    });

    //중복제거
    System.out.println(arr[0]);
    for(int i=1; i<n; i++){
      if(arr[i].equals(arr[i-1])){
          continue;
      }
      System.out.println(arr[i]);
    }

   

  }
}
