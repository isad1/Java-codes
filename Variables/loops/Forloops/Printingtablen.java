package Variables.loops.Forloops;

import java.util.*;
public class Printingtablen {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      for(int i=0 ; i<11 ; i++){
          System.out.println(n*i);
      }
    }
}
