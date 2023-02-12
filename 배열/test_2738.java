package back_java.배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class test_2738 {
   public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String [] NM = bf.readLine().split(" ");
    int N = Integer.parseInt(NM[0]);
    int M = Integer.parseInt(NM[1]);
    //ArrayList 선언
    int[][] arr = new int[N][M];

    //공백단위로 읽기 위해 토큰라이저 사용 
    //StringTokenizer 는 구분자를 생략하면 공백이 기본 구분자이다
    
    for(int c=0; c<2; c++){
      for(int i=0; i<N; i++){
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int j=0; j<M; j++){
          arr[i][j] +=  Integer.parseInt(st.nextToken());
        }
      }
    }
    
    for(int i=0; i<N; i++){
      for(int j=0; j<M; j++){
        bw.write(arr[i][j]+" ");
      }
      bw.write("\n");
    }
    bw.close();   
   }
}
