package back_java.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_2908 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String [] test = bf.readLine().split(" ");
    int [] n1 = new int[3];
    int [] n2 = new int[3];

    //두 수는 세자리 수 0이 포함 
    //문자열을 배열에 넣기 
    String [] N1 = test[0].split("");
    String [] N2 = test[1].split("");
    
    for(int i=2; i>-1; i--){
      n1[i] = Integer.parseInt(N1[i]);
      n2[i] = Integer.parseInt(N2[i]);

      if(n1[i]>n2[i]){
        for(int j =3; j>0; j--){
            System.out.print(N1[j-1]);
        }
        break;
      }
      if(n1[i]<n2[i]){
         for(int k =3; k>0; k--){
            System.out.print(N2[k-1]);
        }
        break;
      }
      else{
        continue;
      }
    
    }

  }
}
