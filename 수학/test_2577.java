package back_java.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_2577 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    String [] num = new String[3];
    int [] tmp = new int[3];

    for(int i=0; i<3; i++){
     num[i] = bf.readLine();
     tmp[i] = Integer.parseInt(num[i]);
    }

    int c= tmp[0]* tmp[1]*tmp[2];
    String n = Integer.toString(c);
    String [] n_arr = n.split("");
    
    for(int j=0; j<10; j++){
      int cnt=0;
      for(int i=0; i<n_arr.length; i++){
        if(j == Integer.parseInt(n_arr[i])){
          cnt++;
        }
      }
      System.out.println(cnt);
    }
  }
}
