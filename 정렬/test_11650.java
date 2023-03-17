package back_java.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class test_11650 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bf.readLine());
    int [][] arr = new int [n][2];
    
    String [][] mat = new String [n][2];
    for(int i=0; i<n; i++){
      mat[i] = bf.readLine().split(" ");
      for(int j=0; j<2; j++){
        arr[i][j] = Integer.parseInt(mat[i][j]);
      }
    }
    
    Arrays.sort(arr, new Comparator<int[]>() {

      @Override
      public int compare(int[] o1, int[] o2) {
        if(o1[0]==o2[0]){ 
          return o1[1]-o2[1];
        }
        else{
          return o1[0]-o2[0];
        }
      }
      
    });

    

    for(int i=0; i<n; i++){
      for(int j=0; j<2; j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }

  }
}
