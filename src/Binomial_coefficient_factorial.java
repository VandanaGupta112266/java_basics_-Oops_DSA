import java.util.*;
public class Binomial_coefficient_factorial {
    public static int factorial(int n){
        int f=1;
        for (int i=n;i>=1;i--){
            f=f*i;
        }
        return f;
    }

    public static void binomial_coeff(int n,int r){
        int n_fact=factorial(n);
        System.out.println("n factorial = "+n_fact);
        int r_fact=factorial(r);
        System.out.println("r factorial = "+r_fact);
        int n_r_fact=factorial((n-r));
        System.out.println("n-r factorial = "+n_r_fact);

        int Bino_coef=(n_fact/(r_fact * n_r_fact));
        System.out.println("binomial coefficient of n and r is  "+Bino_coef);
    }
    public static void add(int a, int b){
        int sum=a+b;
        System.out.println("sum of a & b = " + sum);
    }

    public static void add(float a, float b){
        float sum=a+b;
        System.out.println("sum of a & b = "+ sum);
    }
    public static void add(double a, double b){
        double sum=a+b;
        System.out.println("sum of a & b = "+ sum);
    }
    public static void add(int a, int b, int c){
        int sum=a+b+c;
        System.out.println("sum of a & b &c = "+sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();

        binomial_coeff(n,r);
        //5
        //2
        //n factorial = 120
        //r factorial = 2
        //n-r factorial = 6
        //binomial coefficient of n and r is  10

        add(1,2,3);
        add(1,2);
        add(1245621,4561246);

        //sum of a & b &c = 6
        //sum of a & b = 3
        //sum of a & b = 5806867
        //5
        //2
        //n factorial = 120
        //r factorial = 2
        //n-r factorial = 6
        //binomial coefficient of n and r is  10
        //
        //Process finished with exit code 0

    }
}
