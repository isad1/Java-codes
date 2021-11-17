package Variables.Questions;

import java.util.*;
public class Hollowrectangletwo {
     public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int n = ac.nextInt();
        int m = ac.nextInt();

        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=m ; j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
