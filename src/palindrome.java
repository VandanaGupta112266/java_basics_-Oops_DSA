import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int reverse_no = 0;
        int n=sc.nextInt();
        int temp=n;
        while (n > 0) {
            int lastDigit = n % 10;

            reverse_no = (reverse_no * 10) + lastDigit;
            n = n / 10;
        }
        if(temp==reverse_no){
            System.out.println(reverse_no+" is a palindrone of "+ n);
        }else{
            System.out.println(reverse_no+" is NOT a palindrone of "+ n);
        }
    }

}
