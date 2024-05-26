import java.util.*;
public class Prime {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();

       if(n==2){
           System.out.println("n is prime");
       }else{
           boolean isPrime=true;
           for(int i=2;i<=Math.sqrt(n);i++){  //condition  can be n-1 for worse case time complexity
               if(n%i==0){
                   isPrime=false;
               }
           }

           if(isPrime==true){
               System.out.println("n is prime");
           }else{
               System.out.println("n is NOT prime");
           }
       }


    }
}
