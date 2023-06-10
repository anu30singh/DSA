import java.util.Arrays;

public class subsetSum {
    //you are given a array of integer , find the subsequences whose sum is equal to target 

    public static Boolean f(int index , int target ,int arr[] , int dp[][]) {
        if(target==0) return true;
        if (index==0) return arr[0] == target;
        if(dp[index] [ target] != -1) return dp[index][target]==0  ;
        boolean notTake = f(index-1, target , arr ,dp);
        boolean take = false ;
        if (arr[index]<= target ) take = f(index-1, target - arr[index] , arr , dp);
        dp[index][target] = take || notTake ? 1:0;
        return notTake||take;




    }
    public static void main(String[] args) {
        

    int arr[] = {1,2,3,4,5,6,7,8};
    int target = 9;
    int n = arr.length;
    int dp [][] = new int[n][target+1];
   for(int row[]: dp)
    Arrays.fill(row,-1);

   boolean ans = f(n-1 , target , arr , dp);
   System.out.println(ans);
}
}
