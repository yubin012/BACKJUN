package back_java.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test_2609 {
  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String [] num = bf.readLine().split(" ");

    int n1 = Integer.parseInt(num[0]);
    int n2 = Integer.parseInt(num[1]);

    int c = gcd(n1,n2);
    int d = lcm(n1,n2);
    System.out.println(c);
    System.out.println(d);

  }
  public static int gcd(int a, int b){
    if(b ==0){
      return a;
    }
    else{
      return gcd(b, a%b);
    }
  }
  //이실직고 말하면 최소공배수는 몰라서 구글에 찾아봄 
  public static int lcm(int a,int b){
    return a*b/gcd(a,b);
  }
}
