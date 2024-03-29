 class Node {
     int key;
    Node left;
    Node right;
    //constructor
    Node(int k) {
        key = k;
    }
}
 
 class MaxBinaryTree {
    public static int getMax( Node root) {
    if(root== null) return Integer.MIN_VALUE;
    else return Math.max(root.key , Math.max(getMax(root.left) , getMax(root.right)) );

}
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(80);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        System.out.println(getMax(root));
    }
}
 
 
