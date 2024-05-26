import java.util.*;
public class functions_pract_ques {

    public static void Average(int a,int b,int c){
        int avg=(a+b+c)/3;
        System.out.println(avg);
    }

    public static boolean isEven(int n){
        // Check if the remainder when divided by 2 is 0
        return (n% 2 == 0);


    }

    public static void palindrome(int num){
        int original_num=num;
        int reverse_num=0;
        while(num>0) {
            int lastdigit = num % 10;
            reverse_num= reverse_num*10+lastdigit;
            num=num/10;
        }
        if(original_num==reverse_num){
            System.out.println(original_num+ " this num is palindrome");

        }else{
            System.out.println(original_num+ "this num is NOT palindrome");
        }
    }


    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in) ;
       int n=sc.nextInt();
       int num=sc.nextInt();
        Average(1,2,3) ;
        System.out.println(isEven(n));
        palindrome(num);

    }

}
