package back_java.입출력;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class test_3003 {
  public static void main(String[] arge)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    String [] arr ={"1","1","2","2","2","8"};
    String [] input = bf.readLine().split(" "); //문자열 입력받기
    int [] strr =new int[6];
    for(int i=0; i<6; i++){
      strr[i] =(Integer.parseInt(arr[i])-Integer.parseInt(input[i]));
    }

    for(int j=0; j<6; j++){
      System.out.print(strr[j]+" ");
    }
  }
  
}
