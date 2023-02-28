package back_java.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test_1152 {
  public static void main(String[] args) throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    String str = bf.readLine();
    st = new StringTokenizer(str);
    int cnt = st.countTokens();

    System.out.println(cnt);

  }
}
