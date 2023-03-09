package back_java.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test_2798 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String [] arr = bf.readLine().split(" ");
  
    int N = Integer.parseInt(arr[0]);
    int M = Integer.parseInt(arr[1]);
    
    int [] num = new int[N];
     //StringTokenizer 의 nextToKen() 메소드는 단순히 공백 자리를 땡겨 채우는 것이므로
    //split 처럼 정규식이나 인덱스를 사용하는 때보다 속도 처리가 빠를 수 밖에 없다.   
    StringTokenizer st = new StringTokenizer(bf.readLine());

    for(int i=0; i<N; i++){
      num[i] = Integer.parseInt(st.nextToken());
    }
    //오름차순 정렬
    Arrays.sort(num);

    
    int sum =0;
    int res =0;
   
    for(int i=0; i<N-2; i++){
      for(int j=i+1; j<N-1; j++){
        for(int k= j+1; k<N; k++){
          sum = num[i] + num[j]+num[k];
          if(sum>res && sum <= M){
            res = sum;
          }
        }
      }
    }
    
    System.out.println(res);

  }
}
