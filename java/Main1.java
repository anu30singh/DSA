import java.util.Scanner;
public class Main1 {
	
	public static void main(String[] args) {
        
		int originalNumber, remainder, result = 0;
        
        Scanner s= new Scanner(System.in);
    int n= s.nextInt();

        originalNumber = n;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == n)
            System.out.println(" true ");
        else
            System.out.println("false");

	}
}
