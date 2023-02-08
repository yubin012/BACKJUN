package back_java.반복문;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.io.IOException; 

public class test_2438 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int c = Integer.parseInt(bf.readLine());
    for(int i=1; i<c+1; i++){
      for(int j=0; j<i; j++){
        bw.write("*");
      }
      bw.write("\n");
    }
    bw.close();
  }
  
}
