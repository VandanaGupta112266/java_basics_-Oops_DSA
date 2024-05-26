public class Max_or_min_subarray {

    public static void max_and_min_subarray_sum(int numbers[]){

        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=start;j<numbers.length;j++){
                int end=j;
                int current_sum=0;
                for(int k=start;k<=end;k++){
                    current_sum=current_sum+numbers[k];
                    System.out.print(numbers[k]+" ");

                }
                System.out.print("  = "+current_sum);
                System.out.println();


                if(current_sum>maxSum){
                    maxSum=current_sum;

                }
                if (current_sum<minSum) {
                    minSum=current_sum;

                }

            }

        }

        System.out.println( "subarray having maximum sum : "+maxSum);
        System.out.println("subarray having minimum sum : "+minSum);
    }
    //output
    //array : int numbers[]={2,4,6,8,10};
    //2   = 2
    //2 4   = 6
    //2 4 6   = 12
    //2 4 6 8   = 20
    //2 4 6 8 10   = 30
    //4   = 4
    //4 6   = 10
    //4 6 8   = 18
    //4 6 8 10   = 28
    //6   = 6
    //6 8   = 14
    //6 8 10   = 24
    //8   = 8
    //8 10   = 18
    //10   = 10
    //subarray having maximum sum : 30
    //subarray having minimum sum : 2
    //
    //time complexity : O(n**3) worse buz of 3 loop

    //Process finished with exit code 0

    public static void  prefix_array(int numbers[]){
        //how to calculate prefix array
        //prefix[i-1] + arr[i]

        //how to find current sum
        //prefix[end]-prefix[start-1]
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++) {
            prefix[i]=prefix[i-1] + numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=start;j<numbers.length;j++){
                int end=j;
                int current_sum=0;
                //for(int k=start;k<=end;k++){
                //                    current_sum=current_sum+numbers[k];
                //                    System.out.print(numbers[k]+" ");
                //
                //                }
                //ternary operator
                current_sum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
                System.out.print("  = "+current_sum);
                System.out.println();


                if(current_sum>maxSum){
                    maxSum=current_sum;

                }
                if (current_sum<minSum) {
                    minSum=current_sum;

                }

            }

        }

        System.out.println( "subarray having maximum sum : "+maxSum);
        System.out.println("subarray having minimum sum : "+minSum);

    }
    //output
    //= 1
    //  = -1
    //  = 5
    //  = 4
    //  = 7
    //  = -2
    //  = 4
    //  = 3
    //  = 6
    //  = 6
    //  = 5
    //  = 8
    //  = -1
    //  = 2
    //  = 3
    //subarray having maximum sum : 8
    //subarray having minimum sum : -2
    //time complexity = O(n**2)
    //Process finished with exit code 0

    public static void kadanes(int numbers[]){

        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0;i<numbers.length;i++){
            currSum=currSum + numbers[i];
            if (currSum < 0) {
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);


        }
        System.out.println("our maximum subarray sum is :" + maxSum);

    }
    //output
    //our maximum subarray sum is :7






    public static void main(String[] args) {
        /*
        int numbers[]={1,-2,6,-1,3};
        max_and_min_subarray_sum(numbers);
        */
        /*
        int numbers[]={1,-2,6,-1,3};
        prefix_array(numbers);
        */
        /*
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
         */
    }
}
