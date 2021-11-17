package Variables.Functions;

import java.util.*;
public class Printingname {
   public static void myName(String name){
       System.out.println(name);
       return ;
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String name = sc.next();
      
      myName(name); //call kia function
    }
}
