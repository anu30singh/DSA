
//queues basics
public class queues {
   private int data [];
   private int front;//indexes 
   private int rear;
   private int size;
   public queues () {
data = new int[5];
front = -1;
rear= -1;
   }
   public int size () {
    return size;
   }
   public boolean isEmpty() {
return size==0;
   }
}
