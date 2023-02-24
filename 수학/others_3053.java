package back_java.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메모리 : 14036
// 시간   : 116 ms

// 내 메모리 : 14180
// 내 시간   : 120
public class others_3053 {
  public static void main(String args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    //나머지가 42까지 가능
    int [] arr = new int[42];

    for(int i=0; i<42; i++){
      int a = Integer.parseInt(bf.readLine())%42;
      arr[a]++;
    }

    int res =0;
    for(int i=0; i<42; i++){
      if(arr[i] != 0){
        res++;
      }
    }
    System.out.println(res);
  }
}
