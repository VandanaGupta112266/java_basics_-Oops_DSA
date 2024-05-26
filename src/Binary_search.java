import java.util.*;
public class Binary_search {

    public static int binarySearch(int numbers[], int key){
        int start=0 ,end=numbers.length-1;

        while(start <= end){
            int mid = (start + end)/2;

            //comparsions
            if(numbers[mid] == key){
                //found
                return mid;
            }
            if(numbers[mid] < key){
                //right
                start = mid+1;
            }else{
                //left
                end = mid-1;
            }
        }
        return -1;
    }

    public static void reverseArray(int numbers[]){
        int first=0, last = numbers.length-1;
        while(first<last){
            //swap
            int temp=numbers[first];
            numbers[first] = numbers[last];
            numbers[last]=temp;
            first++;
            last--;

        }

    }
    //output
    //10 8 6 4 2
    //space complexity constant means O(1)
    //time complexity O(n)

    public static void all_unique_pairs_in_array(int numbers[]){
        //nested loop
        int totalPair=0;
        for(int i=0;i<numbers.length;i++){

           for(int j=i+1;j<numbers.length;j++){
               System.out.print("("+numbers[i]+","+numbers[j]+") ");
               totalPair++;
           }
            System.out.println();
        }
        System.out.println("total pair = "+totalPair);
    }
    //output
    //(2,4) (2,6) (2,8) (2,10)
    //(4,6) (4,8) (4,10)
    //(6,8) (6,10)
    //(8,10)
    //total pair = 10

    //formula for total pair is also there if we know number of elements
    //total pair = n*(n-1)/2   n is number of elements in an array
    //### time complexicity O(n**2)  buz nested loop is used

    public static void subarray(int numbers[]){
        //nested loop
        int total_subarrays=0;
        int sum=0;

        for(int i=0;i<numbers.length;i++){

            for(int j=i;j<numbers.length;j++){

                for(int k=i;k<=j;k++){

                    sum=sum+numbers[k];
                    System.out.print(numbers[k]+" ");

                }
                System.out.print("       ");
                System.out.print("sum of this subarray = "+sum);
                System.out.println();


                total_subarrays++;
            }
            System.out.println();
        }
        System.out.println("total pair = "+total_subarrays);
    }
    //output
    //2        sum of this subarray = 2
    //2 4        sum of this subarray = 6
    //2 4 6        sum of this subarray = 12
    //2 4 6 8        sum of this subarray = 20
    //2 4 6 8 10        sum of this subarray = 30
    //
    //4        sum of this subarray = 4
    //4 6        sum of this subarray = 10
    //4 6 8        sum of this subarray = 18
    //4 6 8 10        sum of this subarray = 28
    //
    //6        sum of this subarray = 6
    //6 8        sum of this subarray = 14
    //6 8 10        sum of this subarray = 24
    //
    //8        sum of this subarray = 8
    //8 10        sum of this subarray = 18
    //
    //10        sum of this subarray = 10
    //
    //total pair = 15

    //formula for total subarray is also there if we know number of elements
    //total pair = n*(n+1)/2   n is number of elements in an array
    //### time complexicity O(n**2)  buz nested loop is used


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        int numbers[] = {2,4,6,8,10,12,14};
        int key=sc.nextInt();

        System.out.println("index for key is : "+ binarySearch(numbers,key));
        */

        /*
        int numbers[] = {2,4,6,8,10};
        //function call
        reverseArray(numbers);
        //print reverse array
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        */

        /*
        int numbers[] = {2,4,6,8,10};
        all_unique_pairs_in_array(numbers);
         */
        int numbers[] = {2,4,6,8,10};
        subarray( numbers);

    }

}
/*
*** IMPORTANT NOTE BINARY SEARCH(eg. dictionary) ***
1.PREREEQUISITE- sorted arrays

 * ##PSEUDOCODE
 * start=0,end=n-1
 * while(start<=end(
 *   find mid  //(start+end)/2
 *   compare mid and key
 *      mid==key  found
 *      mid>key   left  1st half - endupdate-(mid-1)
 *      mid<key   right  2sd half -  startupdate-(mid+1)
 * if key doesnot exist return -1 and log some msg
 * array
 *
 2.SPACE AND TIME COMPLEXITY  :- (iterations)
 * iteration 1      n(size of array)n/2**0
 * iteration 2      n/2             n/2**1
 * iteration 3      n/4             n/2**2
 * iteration 4      n/8             n/2**3
 * iteration 5      .                  .
 *                  .                  .
 * iteration (k+1)  1               n/2**k =1
 *
 * n/2**k =1  => n=2**k  =>  ## k=log(base2)n ##
 * time complexcity  DIRECLY PROPORTIONAL TO log(base2)n
 * TC = O(log n)   big Oh of log n
 *
 * ###subarray - continuous small part of na array
 *
 *  */

