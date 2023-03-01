package back_java.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test_1157 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    //char 형으로 하나씩 입력받기
    char [] arr = bf.readLine().toCharArray();
    int [] cnt = new int [26];
    //char 형 숫자 int 로 변환
    //26 26
    for(int i=0; i<arr.length; i++){
      int n = (int)arr[i];
      if(n>96){
        cnt[n-97]++;
      }
      else{
       cnt[n-65]++;
      }
    }
    
    int max =0; 
    int max_index =0;

    for(int i=0; i<26; i++){
      if(cnt[i]> max){
        max = cnt[i];
        max_index = i;
      }
    }
    
    int c =0;
    for(int i=0; i<26; i++){
      if(cnt[i] == max){
        c++;
      }
    }

    if(c > 1){
      System.out.println("?");
    }
    else{
      System.out.println((char)(max_index+65));
    }
  }
}
