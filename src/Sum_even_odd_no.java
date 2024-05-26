import java.util.*;
public class Sum_even_odd_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int Esum = 0;
       // int Osum = 0;
       // int Input=n;

        int Esum=0;
        int Osum=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                Esum=Esum+i;
            }else{
                Osum=Osum+i;
            }

        }
        System.out.println(Osum);
        System.out.println(Esum);

        //output
        //input 9
        //25
        //20

        /*
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit % 2 == 0) {
                Esum = Esum + lastDigit;
            } else {
                Osum = Osum + lastDigit;
            }
            n = n / 10;
        }
        System.out.println("sum of all even numbers in " + Input + " is " + Esum);
        System.out.println("sum of all odd numbers in "+Input+" is "+Osum);
        */
        //output

        //sum of all even numbers in 1234567890 is 20
        //sum of all odd numbers in 1234567890 is 25

    }
}