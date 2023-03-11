package back_java.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

//집합 ->set 
//set 은 중복허용 x
//특정 문자열이 포함되어있는지 확인 -> contains() 사용
public class test_11723 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    HashSet<Integer> set = new HashSet<Integer>();
    
     
    int num = Integer.parseInt(bf.readLine());
    boolean check;

    for(int i=0; i<num; i++){
      String [] p = bf.readLine().split(" ");
      if(p[0].contains("add")){
        set.add(Integer.parseInt(p[1]));
      }
      if(p[0].contains("remove")){
        set.remove(Integer.parseInt(p[1]));
      }
      if(p[0].contains("check")){
        check = set.contains(Integer.parseInt(p[1]));
        if(check == true){
          sb.append(1).append("\n");
        }
        else{
          sb.append(0).append("\n");
        }
      }
      if(p[0].contains("toggle")){
        check = set.contains(Integer.parseInt(p[1]));
        if(check == true){
          set.remove(Integer.parseInt(p[1]));
        }
        else{
          set.add(Integer.parseInt(p[1]));
        }
      }
      if(p[0].contains("all")){
         set.clear(); //모든값 제거
         for(int j=0; j<20; j++){
          set.add(j+1);
         }     
      }
      if(p[0].contains("empty")){
         set.clear(); //모든값 제거
      }  
    }
    System.out.println(sb);
  }
}
