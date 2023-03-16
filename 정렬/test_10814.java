package back_java.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class test_10814 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bf.readLine());
    String [][] people = new String[n][2];
    int [] age = new int[n];

    for(int i=0; i<n; i++){
      people[i] = bf.readLine().split(" ");
      age[i]= Integer.parseInt(people[i][0]);
    }

    Arrays.sort(age);
    //중복 제거거
    int[] result = Arrays.stream(age).distinct().toArray();

    
    for(int i=0; i<result.length; i++){
      for(int j=0; j<n; j++){
        if(result[i] == Integer.parseInt(people[j][0])){
          System.out.print(people[j][0]+" ");
          System.out.println(people[j][1]);
        }
      }
    }
  }
}
