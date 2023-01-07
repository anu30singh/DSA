import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        String str = s.next();
        char ch = str.charAt(0);
        
        System.out.println(ch);
        
        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int m3 = s.nextInt();
        
        int average= (m1+m2+m3)/3;
        System.out.println(average);
        
        

		
	}

}
