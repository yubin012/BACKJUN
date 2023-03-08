package back_java.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_2231 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    String n = bf.readLine();
    int n_len = n.length();
    
    int num = Integer.parseInt(n);
    int res=-1;
    
    Loop1 :
    for(int i=1; i<10; i++){
      for(int j=0; j<10; j++){
        for(int k=0; k<10; k++){
          int c = 100*i + 10*j + k + i+ j + k ;
          if( c == num){
            res =100*i + 10*j + k ;
            break Loop1;
          }         
        }
      }
    }
    if( res == -1){
      res = 0;
    }

    System.out.println(res);
  }
}
