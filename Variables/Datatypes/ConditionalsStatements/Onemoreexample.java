package Variables.Datatypes.ConditionalsStatements;

import java.util.*;
public class Onemoreexample {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        if(button==1){
            System.out.println("Namaste");
        }
        else if(button==2){
            System.out.println("Hey");
        }
        else if(button==3){
            System.out.println("Hola");
        }
        else{
            System.out.println("Invalid Button");
        }
    }
}
