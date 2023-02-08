package back_java.반복문;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class test_2741 {
  public static void main(String[] args)throws IOException{
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      

      int c = Integer.parseInt(bf.readLine()); //Int 로 데이터 가공
      for(int i=0; i<c; i++){
         bw.write((i+1)+"\n");
      }
      bw.close();

  }
}
