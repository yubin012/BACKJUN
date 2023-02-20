package back_java.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_10818 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String num = bf.readLine();
    int n = Integer.parseInt(num);

    String arr[] = bf.readLine().split(" ");
    int [] tmp = new int[n];

    for(int i=0; i<n; i++){
      tmp[i] = Integer.parseInt(arr[i]);
    }
    
    int min = tmp[0];
    for(int c:tmp){
      if(c<min){
        min = c;
      }
    }
    int max = tmp[0];

    for(int c:tmp){
      if(c>max){
        max = c;
      }
    }
    System.out.println(min+" "+max);
  }
}
