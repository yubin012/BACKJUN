package back_java.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class tese_11651 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bf.readLine());
    int [][] arr = new int [n][2];
    
    String [][] mat = new String [n][2];
    
    for(int i=0; i<n; i++){
      mat[i] = bf.readLine().split(" ");
      arr[i][0] = Integer.parseInt(mat[i][1]);
      arr[i][1] = Integer.parseInt(mat[i][0]);
      

    }
    
    Arrays.sort(arr, new Comparator<int[]>() {

      @Override
      public int compare(int[] o1, int[] o2) {
        if(o1[0]==o2[0]){ //arr[i][0] 번째 끼리 같으면
          return o1[1]-o2[1]; //arr[i][1] 비교 
        }
        else{
          return o1[0]-o2[0];
        }
      }
      
    });

    

    for(int i=0; i<n; i++){
      int tmp = arr[i][0];
      arr[i][0] = arr[i][1];
      arr[i][1] = tmp;
      for(int j=0; j<2; j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }

  }
}
