package back_java.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_2920 {
  public static void main(String[] args)throws IOException{
   
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String [] d = bf.readLine().split(" ");

    int cnt = 0;
    int tnc = 0;
    for(int i=0; i<8; i++){
      int c = Integer.parseInt(d[i]);
      if(c == (8-i)){
        tnc++;
      }
      else if(c==i+1){
        cnt++;
      }
      else {
        break;
      }
    }

    if(cnt == 8){
      System.out.println("ascending");
    }
    else if(tnc == 8){
      System.out.println("descending");
    }
    else{
        System.out.println("mixed");
    }

  }  
}
