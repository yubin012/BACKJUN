package back_java.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Stack;
import java.util.StringTokenizer;

public class test_10828 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    //hashmap 처럼 생각
    Stack<Integer> stack = new Stack<>();  //스택 선언
    
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(bf.readLine());
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(bf.readLine());
      String s = st.nextToken();

      if (s.equals("push")){
        stack.push(Integer.parseInt(st.nextToken()));
      } 

      if (s.equals("pop")) {
        if (stack.isEmpty()) {
          sb.append(-1 + "\n");
        } 
        else {
          sb.append(stack.pop() + "\n");
        }
      }

      if (s.equals("size")){
         sb.append(stack.size() + "\n");
      }

      if (s.equals("empty")) {
        if (stack.isEmpty()) {
          sb.append(1 + "\n");
        } 
        else {
          sb.append(0 + "\n");
        }
      }
      if (s.equals("top")) {
        if (stack.isEmpty()) {
          sb.append(-1 + "\n");
        }
        else{
          sb.append(stack.peek() + "\n");
        }
      }
    }
    System.out.print(sb);
    }


}





    