import java.util.ArrayList;

public class printSubsequence {
    public static void printF(int index , ArrayList<Integer> dem , int arr[] , int n) {
        n= arr.length;
        if (index>=n) {
            System.out.println(dem);
        
        
        return;

        }
        
      else {
        printF(index+1, dem, arr, n);
        dem.add(arr[index]);
        printF(index+1, dem, arr, n);
        dem.remove(dem.size()-1);

      }
      return;
        
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2};
       // int n= 3;
        ArrayList<Integer> dem = new ArrayList<>();
        printF(0 ,dem, arr , 3);
    }
}
