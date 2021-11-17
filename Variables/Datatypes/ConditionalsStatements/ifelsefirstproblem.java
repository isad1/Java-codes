package Variables.Datatypes.ConditionalsStatements;

import java.util.*;
public class ifelsefirstproblem {
    public static void main(String[] args) {
        Scanner hc = new Scanner(System.in);
        int age = hc.nextInt();

        if(age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("not adult");
        }
    }
}
