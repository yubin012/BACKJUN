package back_java.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test_4153 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

    String str="";

    String last = "0 0 0";
    int tmp = 0;
 
		while (!(str= bf.readLine()).equals(last)){
      String []arr =str.split(" "); 
      int [] abc = new int[3];
      for(int i=0; i<3; i++){
        abc[i] = Integer.parseInt(arr[i]);
      }
      
      for(int i=0; i<2; i++){
        if(abc[i]>abc[i+1]){
          tmp =abc[i+1];
          abc[i+1]=abc[i];
          abc[i] = tmp;
        }
      }

      
      if((abc[0]*abc[0] + abc[1]*abc[1]) == abc[2]*abc[2]){
        sb.append("right").append("\n");
      }
      else{
        sb.append("wrong").append("\n");
      }
    }
    System.out.println(sb);
  }
}
