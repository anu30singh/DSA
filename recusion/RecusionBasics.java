import java.util.Scanner;

public class RecusionBasics {
    //print name n times using recusrion
    public static void print(int i , int n) {
        if (i>n) return;
        System.out.println("Anushka");
        print(i+1, n);
    }

    //printing numbers from 1 to n reverse order
    public static void printnum(int i, int n) {
        if (i<1) return;
        System.out.println(i);
        printnum(i-1, n);
        
    }
    //printing 1 to n using backtracking
    public static void print_backtrack(int i , int n) {

        if (i<1) return;
        print_backtrack(i-1, n);
        System.out.println(i);
    }
    //parametrized recursion for sum of n natural nums
    public static void sumOfN (int i , int sum) { 
        if (i<1) {
            System.out.println(sum);
             return;
        }
        sumOfN(i-1, sum+i);
    }
    public static int summation(int n) {
        if(n==0) return 0;
        return n+ summation(n-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int n = s.nextInt();
       // int i=n;
        //sumOfN(n,0);
        //print(i, n);
      //  printnum(i, n);
     // print_backtrack(i, n);
     System.out.println (summation(n));
    }

}