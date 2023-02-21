package back_java.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_10250 {
  static StringBuilder sb = new StringBuilder();

  public static void hotel(String[]arr){
    int H = Integer.parseInt(arr[0]);
    int W = Integer.parseInt(arr[1]);
    int N = Integer.parseInt(arr[2]);

    int room=0;

    if(H>=N){
      room = N*100 + 1;
    }
    else{
      if(N%H ==0){
        room = H*100 + (N/H);
      }
      else{
        room = (N % H )*100 + N/H + 1; 
      }
    }
    String room_str = Integer.toString(room);
    sb.append(room_str).append("\n");
  }

  public static void main(String[] args)throws IOException{
     BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

     String s = bf.readLine();
     int t = Integer.parseInt(s);

     int [] res = new int[t];

     for(int i=0; i<t; i++){
      String [] arr = bf.readLine().split(" ");
      hotel(arr);
     }
     System.out.println(sb);
  }
}
