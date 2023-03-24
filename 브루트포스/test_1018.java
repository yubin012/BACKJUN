package back_java.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test_1018 {
  public static boolean [][] arr; //공유의 개념으로 static 키워드 사용하기
  public static int min = 64;

  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    String [] nm = bf.readLine().split(" ");
    int n = Integer.parseInt(nm[0]);
    int m = Integer.parseInt(nm[1]);
    
    arr = new boolean[n][m];


    //보드 모든 원소 읽기
    for(int i=0; i<n; i++){
      String str = bf.readLine();

      for(int j=0; j<m; j++){
        if(str.charAt(j)=='w'){
          arr[i][j] = true;
        }
        else{
          arr[i][j] = false;
        }
      }
    }
    
    
    //순회해야하는 사각형 틀 갯수
    int N_row = n-7;
    int M_col = m-7;

    for(int i=0; i<N_row; i++){
      for(int j=0; j<M_col; j++){
        find(i,j);
      } 
    }
    System.out.println(min);
  }
   public static void find(int x, int y){
      int end_x = x+8;
      int end_y = y+8;
      int count =0;

      boolean TF = arr[x][y]; // 첫번째 칸의 색

      for(int i= x; i<end_x; i++){
        for(int j=y; j<end_y; j++){

          if(arr[i][j] != TF){
            count++;
          }
          //다음 칸은 색이 바뀌므로
          //true -> false // false-> true
          TF =(!TF);

        }
        TF= (!TF);
      }

      count = Math.min(count,64-count);
      min = Math.min(min,count);

    }
}
