package back_java.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_2439 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String s = bf.readLine();
    int num = Integer.parseInt(s);

    for(int i=0; i<num; i++){
      for(int j=num-i; j>1; j--){
        System.out.print(" ");
      }
      for(int k=0; k<i+1; k++){
        System.out.print("*");
      }
      System.out.println(" ");
  }
 }
}