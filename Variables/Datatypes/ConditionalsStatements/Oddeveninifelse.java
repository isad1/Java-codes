package Variables.Datatypes.ConditionalsStatements;

import java.util.*;
public class Oddeveninifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
     
        if(x%2==0){
           System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
     
   }
}
