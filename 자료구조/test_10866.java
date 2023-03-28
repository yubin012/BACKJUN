package back_java.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class test_10866 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    StringBuilder sb = new StringBuilder();
    Deque<String> stack = new ArrayDeque<>();

    int n = Integer.parseInt(bf.readLine());
     
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(bf.readLine());
      String s = st.nextToken();

      if(s.equals("push_front")){
        //push 와 달리 addFirist 는 string 형
        stack.addFirst(st.nextToken());
      }
      if(s.equals("push_back")){
        stack.addLast(st.nextToken());
      }

      if(s.equals("pop_front")){
        if(stack.isEmpty()){
          sb.append(-1+ "\n");
        }
        else{
          sb.append(stack.pollFirst()+ "\n");
        }
      }

      if(s.equals("pop_back")){
        if(stack.isEmpty()){
          sb.append(-1+ "\n");
        }
        else{
          sb.append(stack.pollLast()+ "\n");
        }
      }

      if(s.equals("size")){
        sb.append(stack.size()+ "\n");
      }

      if(s.equals("empty")){
        if(stack.isEmpty() == true){
          sb.append(1+ "\n");
        }
        else{
          sb.append(0+ "\n");
        }
      }

      if(s.equals("front")){
        if(stack.isEmpty()){
          sb.append(-1+ "\n");
        }
        else{
          sb.append( stack.getFirst()+ "\n");
        }
      }

      if(s.equals("back")){
        if(stack.isEmpty()){
          sb.append(-1+ "\n");
        }
        else{
          sb.append(stack.getLast()+ "\n");
        }
      }
      

     }
     System.out.print(sb);
  }
}
