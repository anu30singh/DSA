//package linkedlist;
import java.util.Scanner;
public class linkedlistuse {
    // public static Node <Integer> createLinkedlist () {
    //     Node <Integer> n1 = new Node<Integer>(10);
    //     Node <Integer> n2 = new Node<Integer>(20);
    //     Node <Integer> n3 = new Node<Integer>(30);
    //     Node <Integer> n4 = new Node<Integer>(40);
    //     n1.next = n2;
    //     n2.next = n3;
    //     n3.next= n4;
    //     return n1;
    // }
public static Node<Integer> takeInput() {         //taking input
Scanner s = new Scanner (System.in);
int data = s.nextInt();
Node <Integer> head = null;
while (data != -1) {
    Node <Integer> currentNode = new Node <Integer> (data);
    if(head == null) {
        head = currentNode;
    } else {
        Node <Integer> tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail = currentNode;
    }
    
}
return head;
}




    // public static int length(Node<Integer> head){       
	// 	//calculating length of LL
    
    //     int count=0;
       
    //     while (head != null) {
    //         count ++;
    //         head =  head.next;
    //     }
    //     return count;
        
    // } 
//     public static void printLL(Node <Integer> head) { //printing length
// while (head != null) {             
//     System.out.println(head.data);
//     head = head.next;
// }
//     }
    public static Node<Integer> insertR(Node<Integer> head , int elem , int pos ) {  // inserting recursivly
        if (head == null && pos>0) {
return head;
        }
        if (pos==0) {
            Node <Integer> newNode = new Node <> (elem);
            newNode.next = head;
            return newNode;
        } else {
            head.next= insertR(head , elem , pos-1);
            return head;
        }
    }
    public static void printR (Node <Integer> head) {            //printing recursively
        if (head== null) {
            return;
        }
        System.out.println(head.data + " ");
        printR(head.next);
    }
    public static Node<Integer> deleteR (Node <Integer> head , int pos) {
        if ( head == null) {
            return head;
        }
        if (pos==0) {
            return head.next ;
        }
        Node <Integer> smallHead = deleteR (head.next , pos-1);
        head.next = smallHead;
        return head;
    }
    public static void main (String[] args) {
        Node<Integer> head = takeInput();
        head = insertR(head, 20, 2);
        printR(head);
    //  printLL(head);
// Node<Integer> n1 = new Node <>(10); 
// System.out.println(n1);
// System.out.println(n1.next);
// System.out.println(n1.data);





    }
}
