package back_java.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test_1978 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    int num = Integer.parseInt(bf.readLine());
    int [] arr = new int[num];

    StringTokenizer st = new StringTokenizer(bf.readLine());
   

    for(int i=0; i<num; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int cnt=0;
   

    for(int i=0; i<num; i++){
      if(arr[i]==1){
        continue;
      }
      else{
        int tmp =0;
        for(int j=2; j<arr[i]; j++){
          if(arr[i] % j ==0){
            tmp = -1;
          }
        }
        if(tmp != -1){
          cnt ++;
        }
      }

    }

    System.out.println(cnt);

  }
}
