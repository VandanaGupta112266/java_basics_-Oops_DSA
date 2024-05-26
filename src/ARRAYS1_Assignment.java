import java.util.*;
public class ARRAYS1_Assignment {
    public static boolean  NonuniqueNums(int nums[]){
       for(int i=0;i<nums.length-1;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[i]==nums[j]){
                   return true;
               }

           }
       }
       return false;
    }

    public static void rotate(int nums[],int target){
        int n=nums.length;

        reverse(nums,0,n-1);
        reverse(nums,0,target-1);
        reverse(nums,target,n-1);



    }
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap elements at start and end indices
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }
    public static int IndexOfTarget1(int nums[] ,int key){
        for(int i=0; i<nums.length;i++){
            if(nums[i]==key){
                return i;

            }
        }
        return -1;
    }
    public static int binary_search_to_get_IndexOfTarget(int nums[],int key){
        int start=0,end= nums.length-1;
        while (start <= end) {
            int mid=(end+start)/2;
            //comparion
            if(nums[mid]==key){
                return mid;
            }
            if(nums[mid]<key) {
                start=mid+1;
            }else{

                end = mid - 1;
            }

        }
        return -1;
    }

    public static void triplate_subarray(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){

                    }
                }
                System.out.println();
            }
        }
    }



    public static int trapped_water(int height[]){
        int n=height.length;
        //calculating left max
        int leftmax[]= new int[n] ;
         leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //calculating rightmax
        int rightmax[] = new int[n];
         rightmax[n-1]=height[n-1];
        for(int i=n-2;i>0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }
        //calculating  waterlevel thereby trappedWater
        int trappedWater = 0;
        for(int i=0;i<n;i++){
            //finding waterlevel
            int waterLevel= Math.min(leftmax[i],rightmax[i]);
            //calcu trappedWater
            trappedWater+= waterLevel-height[i];

        }
        return trappedWater;

    }
    //output
    //6

    public static void max_profit(int prices[]){



    }





    public static void main(String[] args) {
        /*
        int nums[]={1,2,3};
        System.out.println(NonuniqueNums(nums));

         */

        /*
        int nums[]={4,5,6,7,0,1,2};
        int target=3;
        rotate(nums,target);
        System.out.println("array in assending order :");
        for(int num : nums){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println(IndexOfTarget1(nums,6));
        System.out.println(" below binart search result with time complexity log n");
        System.out.println(binary_search_to_get_IndexOfTarget(nums,10));
        //array in assending order :
        //0 1 2 4 5 6 7
        //5
        // below binart search result with time complexity log n
        //-1

         */
        /*
        int nums[]={-1,0,1,2,-1,-4};
        triplate_subarray(nums);
        */
        /*
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapped_water(height));
         */

        int prices[]={7,1,5,3,6,4};



    }
}
