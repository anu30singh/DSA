package arrays;

public class kadane {
    public static long maxSum(int nums[] , int n){
        //find the maximum sum of subarray
    //we take a sum variable 
    long sum =0;
    //we then take max variable initially containing the lowest value 
    long max =Long. MIN_VALUE;
    //now we will iterate over the array 
    for (int i=0; i<n;i++) {
        sum+=nums[i];
        if (sum > max) {
                max = sum;
            }
        if (sum<0) {
            sum=0;
        } 
        //now for returning empty sum array when the max sum is comming out to be negative
       // if(max<0) max=0;
    }
return max;
    }
    public static void main(String[] args) {
        int nums [] = {1,2,34,6,-8,-4,-3};
        int n = nums.length;
       System.out.println(maxSum(nums, n)); 
    }
    

}
