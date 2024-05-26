import java.util.*;
public class Inverted_Right_triangle_pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of stars uh wants in pattern : ");
        int n =sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println( );
        }

    }

}
//output
//enter the number of stars uh wants in pattern :
//5
//* * * * *
//* * * *
//* * *
//* *
//*