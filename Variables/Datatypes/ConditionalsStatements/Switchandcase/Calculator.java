package Variables.Datatypes.ConditionalsStatements.Switchandcase;

import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b ;
        int diff = a - b ;
        int multi = a * b ;
        int divi = a / b ;
        int modul = a % b ;
        int button = sc.nextInt();
        

        switch(button){
            case 1 : System.out.println(sum);
            break ;
            case 2 : System.out.println(diff);
            break ;
            case 3 : System.out.println(multi);
            break ;
            case 4 : System.out.println(divi);
            break ;
            case 5 : System.out.println(modul);
            break ;
            default : System.out.println("Invalid");
        }
    }
}


//Refer to example 2 for fully correct solution , here in modulus and division it will give wrong
//answer if we take b=0 