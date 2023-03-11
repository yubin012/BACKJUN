package back_java.구현;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


//원형 큐 이용
public class test_11866 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    String [] NK = bf.readLine().split(" ");
    int n = Integer.parseInt(NK[0]);
    int k = Integer.parseInt(NK[1]);

    //Queue/Deque Interface 를 구현하는 클래스 
    // 1. LinkedList (V)
    // 2. ArrayDeque
    // 3. PriorityQueue

    Queue<Integer> queue = new LinkedList<>();

    StringBuilder sb = new StringBuilder();
    sb.append("<");

    for(int i=1; i<=n; i++){
      //offer -> 해당 큐 맨뒤에 값 삽입
      queue.offer(i);
    }
    // k=3 
    while(!queue.isEmpty()){
      //k-1(2번째)수 까지는 큐에서 빼서 맨 뒤로 붙이기 (인덱스 0,1)
      //맨 앞에 있는 두개의 수가 맨 뒤로 들어감 -> 원처럼 순환 
      for(int i=0; i<k-1; i++){
        queue.offer(queue.poll());
      }
      //k번째 수는 큐에서 빼서 순열의 원소로 넣는다.

      //pop -> 큐 맨앞에 있는 값 반환 후 삭제
      // 큐가 비어있는 경우 null 반환
      sb.append(queue.poll());

      if(queue.size() != 0){
        sb.append(", ");
      }
      
    }
    sb.append(">");
    System.out.println(sb);
    

  }
}
