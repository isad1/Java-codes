package Variables.Datatypes.ConditionalsStatements;

import java.util.*;
public class comparingtwovaluesusingifelseifelse {
     public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b){
            System.out.println("EQUAL");
        }
        else if(a>b){
            System.out.println("A is GREATER THAN B");
        }
        else{
            System.out.println("B IS GREATER THAN A");
        }
    }
}
