
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
        public static int height(Node root){
            if(root == null){
                return 0;
            }

            int leftheigh = height(root.left);
            int rightheight = height(root.right);
        
            int myHeight = Math.max(leftheigh, rightheight) + 1;



            return myHeight;
        }
   