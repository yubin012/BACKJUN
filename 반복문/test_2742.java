package back_java.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_2742 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String s = bf.readLine();
    int num = Integer.parseInt(s);
    int tmp = num;
    for(int i=0; i<tmp; i++){
      System.out.println(num);
      num--;
    }
  }
}
