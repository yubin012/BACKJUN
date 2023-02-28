package back_java.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test_2675 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(bf.readLine());

    for(int i=0; i<n; i++){
      String [] str = bf.readLine().split(" ");
      int num = Integer.parseInt(str[0]);

      char [] arr = str[1].toCharArray();

      for(int k=0; k<arr.length; k++){
        for(int j=0; j<num; j++){
          sb.append(arr[k]);
        }
        
      }
      sb.append("\n");

    }
    System.out.println(sb);
  
  }
}
