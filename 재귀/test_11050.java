package back_java.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//메모이제이션 >> 이전에 계산된 값을 저장하여 반복중복된 계산 제거
// nCr = n-1 C r-1 + n-1 C r
public class test_11050 {
  public static void  main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String [] NK = bf.readLine().split(" ");

    

    int N = Integer.parseInt(NK[0]);
    int K = Integer.parseInt(NK[1]);

    int res = NCR(N,K);
    System.out.println(res);
  
  }
  public static int NCR(int n, int k){
    if(n==0 || k ==0){
      return 1;
    }
    else if(n==k){
      return 1;
    }
    else{
      return NCR(n-1,k-1)+NCR(n-1,k);
    }
  }
}
