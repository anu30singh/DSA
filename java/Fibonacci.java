import java.util.Scanner;
public class Fibonacci {
    
    //code for nth term of fibonacci series 1,1,2,3,5,8.....
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int a= 0;
        int b=1;
        int c;
        for (int i=0; i<n;i++) {
            c=a+b;                  //for i=0
            //c=0+1
            //a=1
            //b=1
            // tab hum a ko print karlege 
            a=b;
            b=c;
        }
        System.out.println(a);
    }
}