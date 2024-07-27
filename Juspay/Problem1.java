// The task is to find the cell with maximum weight (The weight of a cell is the sum of cell indexes of all cells pointing to that cell). If there are multiple cells with the maximum weight return the cell with highest index.
// Note: The cells are indexed with an integer value from 0 to N-1. If there is no cell pointing to the ith cell then the weight of the i'th cell is zero.

import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int edge [] = new int[n];
        for(int i=0; i<n;i++) {
            edge[i]= s.nextInt();
        }
        int sum [] = new int [n];
        for(int i=0; i<n ; i++) {
            if(edge[i]!= -1) {
                sum[edge[i]]+= i;
            }
        }
        int max = -1;
        int index = -1;
        for(int i=0; i<n ; i++) {
            if(sum[i]> max || (sum[i] == max && i > index)) {
                max = sum[i];
                index = i;
            }
        }
        System.out.println(index);
        s.close();
    }
}
