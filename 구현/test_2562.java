package back_java.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_2562 {
  public static void  main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String arr[] = new String[9];
    int tmp[] = new int[9];

    for(int i=0; i<9; i++){
      arr[i] = bf.readLine();
      tmp[i] = Integer.parseInt(arr[i]);
    }


    int c=0;
    for(int j=0; j<8; j++){
      if(tmp[j]>tmp[j+1]){
        tmp[j+1] = tmp[j];
      }
      else{
        c=j+1;
      }
    }
    System.out.println(tmp[8]);
    System.out.println(c+1);
    
  }
}
