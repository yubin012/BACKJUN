package back_java.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//시간 초과나지 않게 풀어야함..
//Arrays.sort() 의 경우 dual-pivot Quicksort 알고리즘을 사용하는데
//최악의 경우 o(n^2) 의 시간복잡도를 가진다
//이 문제는 o(n^2) 을 사용하지 못하도록 저격한 문제

//따라서 o(NlogN)을 보장하거나 o(N) 에 가까운 정렬 알고리즘을 사용해야한다.


//Collections.sort 의 사용
// 근데 이것도 개오래걸림 맞긴 맞음 ;;

public class test_2751 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(bf.readLine());

    ArrayList<Integer> list = new ArrayList<>();


    for(int i=0; i<n; i++){
      list.add(Integer.parseInt(bf.readLine()));
    }

    Collections.sort(list);

    for(int v : list){
      sb.append(v).append("\n");
    }
    System.out.println(sb);

  }

}
