package back_java.아스키코드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_2744 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String str = bf.readLine();
    char []arr;
    arr= str.toCharArray();
    int tmp[] = new int[arr.length];
    for(int i=0; i<arr.length; i++){
      tmp[i] = (int)(arr[i]);
      if(65<=tmp[i] && tmp[i]<=90){
        tmp[i] += 32;
      }
      else{
        tmp[i] -= 32;
      }
      int a= tmp[i];
      char c = (char)a;
      System.out.print(c);
    }
  }
}
