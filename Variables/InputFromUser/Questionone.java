package Variables.InputFromUser;
//Take 2 variables a and b and print there sum
import java.util.*;
public class Questionone {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
