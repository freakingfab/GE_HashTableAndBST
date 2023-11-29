package com.bridgelabz.hashtableandbst.bst;

public class BinarySearchTree<K extends Comparable<K>>{
    private MyBinaryNode<K> root;

    /*
        @desc: constructor for the class
        @params: none
        @return: none
     */
    public BinarySearchTree(){
        this.root=null;
    }

    /*
        @desc: returns the root of tree
        @params: none
        @void: MyBinaryTree
     */
    public MyBinaryNode<K> getRoot(){
        return root;
    }

    /*
        @desc: calls function for add node
        @params: Key of node
        @return: void
     */
    public void addNode(K key){
        root = addNodeRecursive(root, key);
    }

    /*
        @desc: adds node in bst(recursive) implementation
        @params: key to be inserted, root node
        @return: MyBinaryNode
     */
    private MyBinaryNode<K> addNodeRecursive(MyBinaryNode<K> root, K key){
        if(root==null){
            return new MyBinaryNode<>(key);
        }
        int compare = key.compareTo(root.key);
        if (compare < 0) {
            root.left = addNodeRecursive(root.left, key);
        } else if (compare > 0) {
            root.right = addNodeRecursive(root.right, key);
        }
        return root;
    }
    /*
        @desc: calls for reurcisve height function
        @params: none:
        @return: int
     */
    public int height(){
        return heightRecursive(root);
    }

    /*
        @desc: give height for tree(recursive)
        @params: root node
        @return: int
     */
    private int heightRecursive(MyBinaryNode<K> root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(heightRecursive(root.left),heightRecursive(root.right));
    }

    /*
        @desc: calls for reurcisve size function
        @params: none:
        @return: int
     */
    public int size(){
        return sizeRecursive(root);
    }

    /*
        @desc: give size for tree(recursive)
        @params: root node
        @return: int
     */
    private int sizeRecursive(MyBinaryNode<K> root){
        if(root == null){
            return 0;
        }
        return 1 + sizeRecursive(root.left) + sizeRecursive(root.right);
    }

    /*
        @desc: calls for recurive display
        @params: none
        @return: void
     */
    public void displayInOrder(){
        displayInOrderRec(root);
    }

    /*
        @desc: calls for recursive add subtree function
        @params: subtree root
        @return: void
     */
    public void addSubtree(MyBinaryNode<K> subtreeRoot) {
        addSubtreeRec(root, subtreeRoot);
    }

    /*
        @desc: adds subtree to main bst
        @params: main root, subtree root
        @return: void
     */
    private void addSubtreeRec(MyBinaryNode<K> root, MyBinaryNode<K> subtreeRoot) {
        if (subtreeRoot == null) {
            return;
        }

        // Add the root of the subtree
        addNode(subtreeRoot.key);

        // Recursively add left and right subtrees
        addSubtreeRec(root, subtreeRoot.left);
        addSubtreeRec(root, subtreeRoot.right);
    }

    /*
        @desc: display bst in-order(recursive call)
        @params: root node
        @return: void
     */
    private void displayInOrderRec(MyBinaryNode<K> root) {
        if (root != null) {
            displayInOrderRec(root.left);
            System.out.print(root.key + " ");
            displayInOrderRec(root.right);
        }
    }
}
