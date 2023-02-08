package back_java.반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class fast_sum {
  public static void main(String[] args)throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    

    int c = Integer.parseInt(bf.readLine()); //Int 로 데이터 가공

    for(int i =0; i<c; i++){
      String [] input = bf.readLine().split(" "); //문자열 입력받기
      int a = Integer.parseInt(input[0]);
      int b = Integer.parseInt(input[1]);
      bw.write(a+b+"\n");
    }

    bw.close();
   
  }


}
