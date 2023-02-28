import java.util.*;

public class Stringbuilderuse {
    public static void main (String [] args) {
        StringBuilder sb = new StringBuilder("ABCDEFGHIJK");
        //deleting an element at particular index
        sb.deleteCharAt(4);
        System.out.println(sb);
        //deleting at particular index
        sb.delete(1,6);
        System.out.println(sb);

        //print String
        System.out.println("String is " + sb.toString());
        //reverse 
        StringBuilder reverseString = sb.reverse();
        System.out.println("reversed string " + reverseString.toString());
        //append 
        sb.appendCodePoint(44); //for appending ,44
        System.out.println("Modified string buffer" + sb);
         //printing modified string
         int capacity = sb.capacity();
         System.out.println(capacity);
         //other methods replace , insert 


    }
}
