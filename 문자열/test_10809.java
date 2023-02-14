package back_java.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_10809 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String str = bf.readLine();
    char [] arr;
    arr= str.toCharArray(); //문자열을 배열에 넣음
    int tmp[] = new int[arr.length];

    for(int i=0; i<arr.length; i++){
      tmp[i] = (int)(arr[i]);
    }

    for(int i=97; i<123; i++){
      int cnt=0;
      for(int j=0; j<arr.length; j++){
        if(tmp[j]==i){
          System.out.print(j+" ");
          cnt++;
          break;
        }
      }
      if(cnt==0){
        System.out.print(-1+" ");
      }
     }
    }
  
}
