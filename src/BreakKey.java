import java.util.Scanner;
public class BreakKey {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0) {
            n = sc.nextInt();
            int last_digit = n % 10;
            if (last_digit == 0) {
                System.out.println(n + " this number is multiple of 10");
                break;
            }

            System.out.println(n);
        }





    }
    /*
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
           int n=sc.nextInt();
           if( n%10==0){
                System.out.println(n+ " this number is multiple of 10");
                break;
           }
        }while(true);
     }
     */
}
