package Variables.Questions.practice;

import java.util.*;
public class first {
    public static void main(String[] args) {
    Scanner ac = new Scanner(System.in);
    int workingMonths = ac.nextInt();
    float totalMoneyPerMonth = ac.nextFloat();
    float salaryPerAnnum = workingMonths * totalMoneyPerMonth ;
    System.out.println(salaryPerAnnum);
    }
}
