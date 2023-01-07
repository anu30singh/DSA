public class towerHanoi {
    public static void Hanoi (int n , char s , char h , char d ) {
        //s- source n- no. of disk h- helper d- destination
        if (n==1) {
            System.out.println("move 1st disk from" + s + " to " +d );
            return;
        }
        Hanoi(n-1, s, d, h);
        System.out.println("move from " + n + " th disk from " + s + " to " + d);
        Hanoi(n-1, h, s, d);
    }
    public static void main(String [] args) {
        Hanoi(3, 's', 'h', 'd');
    }
}
