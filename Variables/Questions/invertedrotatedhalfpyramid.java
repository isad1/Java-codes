package Variables.Questions;

public class invertedrotatedhalfpyramid {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n - i ; j++){
                System.out.print(" ");
            }
            //Here we used j twice because when we come out of the 1st innerloop than it is discarded 
            //and we can use j. 
            for(int j = 1 ; j <=  i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
