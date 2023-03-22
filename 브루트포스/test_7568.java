package back_java.브루트포스;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test_7568 {
  public static void main(String[] args)throws IOException{
    BufferedReader  bf = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bf.readLine());
    String [][] dong_str = new String[n][2];
    int [][] dong = new int [n][2];


    for(int i=0; i<n; i++){
      dong_str[i] = bf.readLine().split(" ");
      dong[i][0] = Integer.parseInt(dong_str[i][0]); //몸무게
      dong[i][1] = Integer.parseInt(dong_str[i][1]); //키
    }
    
    int [] revel = new int [n];

    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        if(dong[i][0]>dong[j][0] && dong[i][1]> dong[j][1]){
          revel[j]++;
        }
      }
    }

    for(int i=0; i<n; i++){
      System.out.print(revel[i]+1+" ");
    }
  }
}

