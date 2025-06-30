package BST;

public class binary {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node buildTree(Node root, int val){

        if(root == null){
            root = new Node(val);
            return root;
        }

        if(val > root.data){
            buildTree(root.right, val);
        }else{
            buildTree(root.right, val);
        }

        return root;
    
    }

    public static void main(String[] args) {

        int arr[] = { 3, 5, 1, 7, 2, 8, 9 };

        Node root = null;

        for(int i = 0; i<arr.length; i++){
            buildTree(root, arr[i]);
        }

    }
}
