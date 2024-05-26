import java.util.Scanner;
public class Right_traingle_attern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of strs uh wants in pattern : ");
        int n=sc.nextInt();
        /*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println( );
        }
        output
        5
*
* *
* * *
* * * *
* * * * *


        */
        for(int i=n;i<=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println( );
        }

    }

}
