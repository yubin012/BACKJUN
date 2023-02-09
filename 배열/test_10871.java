package back_java.배열;

import java.io.BufferedInputStream;
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
  
    String [] nk = bf.readLine().split("");
    int n = Integer.parseInt(nk[0]);
    int k = Integer.parseInt(nk[1]);
    ArrayList<Integer> input = new ArrayList<Integer>();

    for(int i=0; i<n; i++){
      StringTokenizer st = new StringTokenizer(bf.readLine()," ");
      int N = Integer.parseInt(st.nextToken());
      input.add(N);
    }

    for(int i=0; i<n; i++){
      if(input.get(i) < k){
        System.out.printf(input.get(i)+" ");
      }
    }
  }
}
