package back_java.함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_2475 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String [] num = bf.readLine().split(" ");
    int [] tmp = new int[5];

    for(int i=0; i<5; i++){
      tmp[i]= Integer.parseInt(num[i]);
      tmp[i] = tmp[i]*tmp[i];
      
    }
    for(int i=0; i<4; i++){
      tmp[i+1] += tmp[i];
    }

    int c = tmp[4]%10;
    System.out.println(c);

  }
  
}
