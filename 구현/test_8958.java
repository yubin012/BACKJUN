package back_java.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_8958 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    int T = Integer.parseInt(bf.readLine());
    StringBuilder sb = new StringBuilder();

    for(int i=0; i<T; i++){
      String str = bf.readLine();
      char []arr;
      arr= str.toCharArray();
      
      int cnt =0;
      int sum =0;

      for(int j=0; j<arr.length; j++){
        if(arr[j]== 'O'){
          cnt++;
          sum += cnt;
        }
        else{
          cnt =0;
        }
      }
      sb.append(sum).append('\n');   
    }
    System.out.println(sb);
    
  }
}
