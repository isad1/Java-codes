package Variables.Questions.practicetwo;

import java.util.*;
public class questionone {
    public static int thereAverage(int a , int b , int c){
        return (a+b+c)/(3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("The Average of three numbers are :" + thereAverage(a
        , b, c));
    }
}
