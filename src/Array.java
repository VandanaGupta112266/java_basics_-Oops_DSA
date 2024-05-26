import java.util.*;
public class Array {

    public static void update(int marks[]){

        for(int i=0;i<=marks.length;i++){
            marks[i]=marks[i]+1;
            System.out.println("marks at index "+i+" is "+marks[i] );
        }
    }
    //Output
    //marks at index 0 is 98
    //marks at index 1 is 99
    //marks at index 2 is 100

    //update is done using call by reference in array that
    // lead to change in original value
    public static int linear_search (int numbers[],int key){

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key) {
                return i;
            }
        }
        return -1;
    }
    //output
    //key 12 is at index 5

    public static int get_largest(int number[]){
        int largest=Integer.MIN_VALUE;  //-INFINTY
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
            if(smallest>number[i]){
                smallest=number[i];
            }
        }
        System.out.println("smllest value is : "+ smallest);
        return largest;
        //output
        // int key=22;
        //Number not Found!  or
        //int key=12;
        //key is at index 5
    }

    public static void main(String[] args) {


        /*
        int marks[]=new int[100];
        int numbers[]={1,2,3};
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();  //phy
        marks[1]=sc.nextInt();  //chem
        marks[2]=sc.nextInt();  //maths

        System.out.println("phy : "+ marks[0]);
        System.out.println("chem : "+ marks[1]);
        System.out.println("maths : "+ marks[2]);
        marks[2]=marks[2]+1;
        //System.out.println("maths : "+ marks[2]);

        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage : "+percentage + "%");

        //length of array inbuilt function
        System.out.println(marks.length);
        */

        /*
        int marks[]={97,98,99};
        update(marks);
        */


        int numbers[]={2,4,6,8,10,12,14,16,18};
        //int index1=linear_search(numbers,10);
        //System.out.println(index1);
        int key=12;
        int index2=linear_search(numbers, key);

        if(index2==-1){
            System.out.println("Number not Found!");
        }else{
            System.out.println("key is at index "+index2);
        }

        /*
        int number[]={1,2,6,3,5};
        System.out.println("largest value in number array is : "+get_largest(number));
        */
    }
}
