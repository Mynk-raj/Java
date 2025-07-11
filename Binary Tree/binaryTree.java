import java.util.LinkedList;
import java.util.Queue;

public class binaryTree {

    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static class binary {

        public static int idx = -1;

        // Building tree
        public static Node builTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = builTree(nodes);
            newNode.right = builTree(nodes);

            return newNode;
        }

        // <---------- DFS traversal ------------->

        // Traversal of tree : Preorder (Root → Left → Right)
        public static void preorder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }

            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);

        }

        // Traversal of tree : Postorder (Left → Right → Root)
        public static void postorder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }

            preorder(root.left);
            preorder(root.right);
            System.out.print(root.data);
        }

        // Traversal of tree : Inorder (Left → Root → Right)
        public static void inorder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);

        }

        // <------------ BFS traversal -------------->
        // Level order traversal in tree
        public static void levelOrder(Node root) {

            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currentNode = q.remove();
                if (currentNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currentNode.data + " ");
                    if (currentNode.left != null) {
                        q.add(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        q.add(currentNode.right);
                    }
                }
            }

        }

        // sum of specif height node values
        public static int sumOfKth(Node root, int level) {

            if (level == 1) {
                return root.data;
            }
            int count = 1;
            int sum = 0;

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (count != level) {
                while (!q.isEmpty()) {
                    Node currentNode = q.remove();
                    if (currentNode == null) {
                        System.out.println();
                        if (q.isEmpty()) {
                            break;
                        } else {
                            q.add(null);
                            count++;
                        }
                    } else {
                        sum += currentNode.data;
                        if (currentNode.left != null) {
                            q.add(currentNode.left);
                        }
                        if (currentNode.right != null) {
                            q.add(currentNode.right);
                        }
                    }
                }
            }


            return sum;

        }

        // count of nodes in tree
        public static int countOfNodes(Node root) {
            if (root == null) {
                return 0;
            }

            int lefttree = countOfNodes(root.left);
            int righttree = countOfNodes(root.right);

            return lefttree + righttree + 1;

        }

        // Sum of all nodes
        public static int sum(Node root) {
            if (root == null)
                return 0;

            int sum = root.data;

            sum += sum(root.left);
            sum += sum(root.right);

            return sum;
        }

        // Height of tree
        public static int height(Node root) {
            if (root == null) {
                return 0;
            }

            int leftheigh = height(root.left);
            int rightheight = height(root.right);

            int myHeight = Math.max(leftheigh, rightheight) + 1;

            return myHeight;
        }

        // Diameter of a tree time complexity : O(n^2)
        public static int diameter(Node root) {
            if (root == null) {
                return 0;
            }

            int diame1 = diameter(root.left);
            int diame2 = diameter(root.right);
            int diame3 = height(root.left) + height(root.right) + 1;

            return Math.max(diame3, Math.max(diame2, diame1));

        }

        // Diameter of a tree time complexity : O(n)
        public static class treeinfo {
            int ht;
            int dia;

            treeinfo(int ht, int dia) {
                this.ht = ht;
                this.dia = dia;
            }
        }

        public static treeinfo diameter2(Node root) {

            if (root == null) {
                return new treeinfo(0, 0);
            }

            treeinfo left = diameter2(root.left);
            treeinfo right = diameter2(root.right);

            int myHeight = Math.max(left.ht, left.ht) + 1;

            int dia1 = left.dia;
            int dia2 = right.dia;
            int dia3 = left.ht + right.ht + 1;

            int mydia = Math.max(Math.max(dia1, dia2), dia3);

            treeinfo myinfo = new treeinfo(myHeight, mydia);

            return myinfo;
        }

    }

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1 };

        binary tree = new binary();

        Node root = tree.builTree(nodes);

        System.out.println("Root of the tree : " + root.data);

        System.out.print("Preorder traversal in tree : ");
        tree.preorder(root);

        System.out.print("\nInorder traversal in tree : ");
        tree.inorder(root);

        System.out.print("\nPostorder traversal in tree : ");
        tree.postorder(root);

        System.out.println("\nLevel order traversal in tree :");
        tree.levelOrder(root);

        System.out.println("count of nodes in the tree is : " + tree.countOfNodes(root));

        System.out.println("sum of all nodes in tree : " + tree.sum(root));

        System.out.println("Height of tree is : " + tree.height(root));

        System.out.println("Diameter of tree is : " + tree.diameter(root));

        System.out.println("Diameter of tree ussing optimal approch : " + tree.diameter2(root).dia);

        System.out.println("sum of nth level nodes are : " + tree.sumOfKth(root,2));

        


        
    }
}
