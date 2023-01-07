import java.util.Scanner;
public class Sol2 {

	public static void main(String[] args) {
		
 Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        double d= s.nextDouble();
        int i=0;
        while (i<n) {
            int j=1;
            char valchar= (char)('A'+ i);
            while (j<=i+1){
                System.out.print(valchar);
                j+=1;
            }
            System.out.println();
            i=i+1;
        }

		
	}

}