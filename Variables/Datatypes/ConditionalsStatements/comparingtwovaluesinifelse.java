package Variables.Datatypes.ConditionalsStatements;

import java.util.Scanner;

import java.util.*;
public class comparingtwovaluesinifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b){
            System.out.println("Equal");
        }else{
            if(a>b){
                System.out.println("a is Greater than b");
            }
            else{
                System.out.println("b is greater than a");
            }
        }

    }
}