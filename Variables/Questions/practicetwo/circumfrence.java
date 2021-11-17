package Variables.Questions.practicetwo;
//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
public class circumfrence {
    public static double circumfrenceOfCircle(double c){
        return 2 * 3.14 * c ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        System.out.println(circumfrenceOfCircle(c));
    }
}
