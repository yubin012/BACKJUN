package back_java.입출력;

public class test_25083 {
  //제어문자(이스케이프 시퀀스) 에 대해 알고 있어야하는 문제
  //큰따옴표를 출력하고 싶을때는 백슬래시를 사용해야한다.
  // 백슬래시 + 문자조합 으로 해당 문자를 그대로 출력할 수 있다.
  public static void main(String[] args){
     String s = "         ,r'\"7\n"+
             "r`-_   ,'  ,/\n"+
             " \\. \". L_r'\n"+
             "   `~\\/\n"+
             "      |\n"+
             "      |";

     System.out.println(s);

  }
 

}
