import java.util.*;
public class BinToDec {
    //binary to decimal
    public static void bintodec(int binnum){
        int mynum=binnum;
        int pow=0;
        int dec=0;
        while(binnum>0){
            int lastdigit=binnum%10;
            dec=dec+(lastdigit*(int)Math.pow(2,pow ));
            pow++;
            binnum=binnum/10;

        }
        System.out.println("decimal of binary number "+mynum +" is "+dec);
    }


    //decimal to binary
    public static void dectobin(int n){
        int mynum=n;
        int pow=0;
        int binnum=0;
        while(n>0){
            int rem=n%2;
            binnum=binnum+(rem*(int)Math.pow(10,pow));

            pow++;
            n=n/2;//quotient
        }
        System.out.println("binary of "+mynum +" is "+binnum);

    }
    public static void main(String[] args) {
        bintodec(101);
        dectobin(11);
    }
}
