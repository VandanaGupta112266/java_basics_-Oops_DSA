import java.util.*;
public class Prime_within_range {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(2);
        for(int i=2;i<=n;i++){
            if(n%i!=0 ){
                System.out.println(i);
            }
        }

    }
}
