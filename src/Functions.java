import java.util.*;
public class Functions   {
    public static void printHelloWorld(){
        System.out.println("hellow world");
        System.out.println("hellow world");
        System.out.println("hellow world");
        System.out.println("hellow world");
        System.out.println("hellow world");
    }

    public static void calculateSum(int n1,int n2){
        int sum=n1+n2;
        System.out.println("sum is : "+sum);
    }

    public static int calculateSub(int n1,int n2){  //parameters or formal parameters
        int sub=n1-n2;
        return sub;
    }

    public static void swapnum(int a,int b){
        int temp=0;
        System.out.println("before swapping");
        System.out.println("a = "+a);
        System.out.println("b = "+b );
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping");
        System.out.println("a = "+a);
        System.out.println("b = "+b );

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printHelloWorld();
        calculateSum(a, b);
        int substract = calculateSub(a, b); // arguments or actual parameters
        System.out.println(substract);
        //5
        //2
        //hellow world
        //hellow world
        //hellow world
        //hellow world
        //hellow world
        //sum is : 7
        //3
        //Process finished with exit code 0
        swapnum(a, b);
        System.out.println("After calling swap function value of a ans b remained unchange in Main function");
        System.out.println("a = "+a);
        System.out.println("b = "+b );
        //before swapping
        //a = 5
        //b = 2
        //After swapping
        //a = 2
        //b = 5
        //After calling swap function value of a ans b remained unchange in Main function
        //a = 5
        //b = 2
        //
        //Process finished with exit code 0
    }
}
