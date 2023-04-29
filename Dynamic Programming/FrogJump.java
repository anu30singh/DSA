import java.util.*;
//Geek wants to climb from the 0th stair to the (n-1)th stair. At a time the Geek can climb either one or two steps.
// A height[N] array is also given. Whenever the geek jumps from stair i to stair j, the energy consumed in the jump is abs(height[i]- height[j]),
// where abs() means the absolute difference. return the minimum energy that can be used by the Geek to jump from stair 0 to stair N-1.
public class FrogJump {
    public static int f(int index , int [] height , int dp[]) {
        if(index==0) return 0;
        if(dp[index] != -1) return dp[index];
        int left = f(index-1 , height , dp) + Math.abs(height[index] - height[index-1]);
        int right = Integer.MAX_VALUE;
        if(index>1) right = f(index-2 , height , dp) + Math.abs(height[index] - height[index-2]);
        return dp [index] = Math.min(left, right);
    }
    //memoization
    public static void main(String[] args) {
        int height [] = {10 , 20 , 30, 10};
        int n = height.length;
        int dp[] = new int [n];
        Arrays.fill(dp, -1);
        System.out.println(f(n-1, height , dp ));


        
    }



}