package back_java.함수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//int 로 하면 30점 .. 큰 수 범위일땐 long 사용하기

public class test_15964 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    String [] AB = bf.readLine().split(" ");
    long A = Long.parseLong(AB[0]);
    long B = Long.parseLong(AB[1]);
    
    long c = test(A,B);

    System.out.println(c);
    
    

  }
  
  static long test(long a, long b){
    long c = (a+b)*(a-b);
    return c;
  }
}
