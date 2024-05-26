import java.util.*;
public class Optimized_Prime {

    public static boolean isPrime(int n){

        if(n==2){

            return true;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }return true;

    }
    public static void primesInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(9));

        primesInRange(20);  //2 to 20
    }
}
