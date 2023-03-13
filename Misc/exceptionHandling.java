public class exceptionHandling {
    public static int divide(int a, int b) throws divideByZero {
        if (b==0)
        throw new divideByZero();

        return a/b;
    }
    // main passes the exception to user yahi console m dikhega...yaha divide ke baad ki lines excecute nhi hogi
//     public static void main (String[] args) throws divideByZero {
// divide(11,0);
// Syos("main")
//     }

//main handles the exception using try catch...aur aage ki lines excecute hogi
    public static void main (String[] args)  {
        try {
            divide(11,0);
        } catch(divideByZero e) {
System.out.println("divide by zero exception");
        }
        
        
            }
}
