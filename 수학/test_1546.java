package back_java.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class test_1546 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int  n = Integer.parseInt(bf.readLine());

    String [] arr = bf.readLine().split(" ");
    double [] num = new double[n];

    for(int i=0; i<n; i++){
      num[i] = Double.parseDouble(arr[i]);
      System.out.println(num[i]);
    }
    
    //오름차순 
    Arrays.sort(num);
   
    double sum=0;
    for(int i=0; i<n; i++){
      num[i]= num[i]/num[n-1] *100;
      sum += num[i];
    }
    System.out.println(sum/n);
  }
}
