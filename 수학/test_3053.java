package back_java.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test_3053 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    int arr[] = new int[10];

    for(int i =0; i<10; i++){
      int n = Integer.parseInt(bf.readLine());
      arr[i] =n%42;
    }

    Arrays.sort(arr);
    
    int cnt = 1;

    for(int i=0; i<9; i++){
      if(arr[i] !=arr[i+1]){
        cnt++;
      }
    }

    System.out.println(cnt);
  }
}
