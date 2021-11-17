package Variables.Datatypes.ConditionalsStatements.Switchandcase;

import java.util.*;
public class firstexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button) {
            case 1 : System.out.println("Namaste");
            break;
            case 2 : System.out.println("Hey");
            break;
            case 3 : System.out.println("Hola");
            break;
            
            default: System.out.println("Invalid");
        }
    }
}
