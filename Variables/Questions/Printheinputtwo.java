package Variables.Questions;

import java.util.*;
public class Printheinputtwo {
    public static void main(String[] args){
     Scanner hc = new Scanner(System.in);
     int m = hc.nextInt();
     int n = hc.nextInt();

     for(int i=1 ; i<=m ; i++){
         for(int j=1 ; j<=n ; j++){
             System.out.print("*");
         }
         System.out.println(6);
     }
    }
}
