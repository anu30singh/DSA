import java.util.Scanner;
public class Solu {

	public static void printFahrenheitTable(int start, int end, int step) {
        
        
        int currentValue=start;
         while(currentValue<= end) 
         {
           
             int fahrenheitValue= (int)((5.0/9)*(currentValue-32));
             System.out.println (currentValue + " " +fahrenheitValue);
                       currentValue+=step;
         }
        }
	

        public static void main( String[]args) {
            Scanner sc = new Scanner(System.in);
            int S = sc.nextInt();
            int E = sc.nextInt();
            int W = sc.nextInt();
            Solu.printFahrenheitTable(S,E,W);
        }
    
}
