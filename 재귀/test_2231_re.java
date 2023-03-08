package back_java.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_2231_re {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    //분해합

    int n = Integer.parseInt(bf.readLine());
    int m =0; 
    for( int i=1; i<n; i++){
      int num =i;
      int sum =0;
      while(num != 0){
         sum += num %10;
         num /=10;
      }
      if(sum+i == n){
        m =i;
        break;
      }
    }
    System.out.println(m);
  }
}
