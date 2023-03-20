package back_java.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_1436 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(bf.readLine());
    int cnt=0;
    int t=0;
    

    while(cnt != n){
     t++;
     int tmp = t;
     while(tmp != 0){
      if(tmp % 1000 == 666){
        cnt++;
        break;
      }
      else{
        tmp /= 10;
      }
     }
    }
    System.out.println(t);

  }
}
