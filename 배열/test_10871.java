package back_java.배열;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class test_10871 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    //bf.reanLine() 이라는 것이 한줄만 읽는 것이다 
    
    //n이랑 k 입력받을 배열
    String [] nk = bf.readLine().split(" "); // 공백 띄어쓰기 잘하자 이거 안하면 출력 안됨;;
    int n = Integer.parseInt(nk[0]);
    int k = Integer.parseInt(nk[1]);

    //n 개의 수를 입력받을 배열

    //공백 단위로 읽기 !
    StringTokenizer st = new StringTokenizer(bf.readLine()," ");

    for(int i=0; i<n; i++){
      int N = Integer.parseInt(st.nextToken());
      if(N < k){
        bw.write(N+" ");
      }
    }
    bw.flush();
    bw.close();
  }
}
