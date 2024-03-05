package SquareRootDecomposition;

public class sumQuery {
   
    public static int query (int[] block , int[] arr ,int l , int r , int sqrtVal) {
        int ans=0;

        while (l%sqrtVal != 0 && l!=0 && l<r) {
            ans+=arr[l];
            l++;
        } 
        //middle part
        while (l+sqrtVal<= r) {
            ans+= block[l/sqrtVal];
            l+=sqrtVal;
        }
        while(l<=r) {
            ans+= arr[l];
            l++;
        }
        return ans;
    }

    public static void update (int[] block , int[] arr ,int i , int val , int sqrtVal) {
      int block_id = i/sqrtVal;
      block[block_id]+= (val- arr[i]);
      arr[i] = val;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7,8,9,2};
        int n = arr.length;

        //block array 
        int sqrtVal = (int) Math.sqrt(n);
        int block_id =-1;

        int[] blocks = new int [sqrtVal+1];

        for(int i=0; i<n; i++ ) {
            if(i% sqrtVal ==0) {
                block_id++;
            }
            blocks[block_id]+=arr[i];
        }
 
    }
    
}
