public class Sub_array {
    public static void subarray(int numbers[]){
        //nested loop
        int total_subarrays=0;
        int sum=0;

        for(int i=0;i<numbers.length;i++){

            for(int j=i;j<numbers.length;j++){

                for(int k=i;k<=j;k++){
                    System.out.println();
                    sum=sum+numbers[k];
                    System.out.print(numbers[k]+" ");

                }
                System.out.print("       ");
                int subarraySum=sum;
                System.out.print("sum of this subarray = "+subarraySum);
                System.out.println();

                total_subarrays++;
            }
            System.out.println();
        }
        System.out.println("total pair = "+total_subarrays);
    }

    public static void main(String[] args) {

        int numbers[] = {2,4,6,8,10};
        subarray( numbers);

    }
}
