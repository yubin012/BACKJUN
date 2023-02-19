package back_java.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test_11720 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
   
    String n = bf.readLine();
    int num = Integer.parseInt(n);
    
    String arr[] = bf.readLine().split("");
    int tmp[]= new int [num];

    for(int i=0; i<num; i++){
      tmp[i] = Integer.parseInt(arr[i]);
    }
    for(int j=1; j<num; j++){
      tmp[j] += tmp[j-1];
    }
    System.out.println(tmp[num-1]);
  
  }
}
