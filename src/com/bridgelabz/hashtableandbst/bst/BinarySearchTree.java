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
        @desc: give height for tree(recursive)
        @params: root node
        @return: int
     */
    public int height(MyBinaryNode<K> root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(height(root.left),height(root.right));
    }

    /*
        @desc: give size for tree(recursive)
        @params: root node
        @return: int
     */
    public int size(MyBinaryNode<K> root){
        if(root == null){
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }


    /*
        @desc: adds subtree to main bst
        @params: main root, subtree root
        @return: void
     */
    public void addSubtree(MyBinaryNode<K> root, MyBinaryNode<K> subtreeRoot) {
        if (subtreeRoot == null) {
            return;
        }

        // Add the root of the subtree
        addNode(subtreeRoot.key);

        // Recursively add left and right subtrees
        addSubtree(root, subtreeRoot.left);
        addSubtree(root, subtreeRoot.right);
    }

    /*
        @desc: serach for key in bst
        @params: root of bst, key
        @return boolean
     */
    public boolean search(MyBinaryNode<K> root, K key) {
        if (root == null) {
            return false;
        }
        if (key.compareTo(root.key) == 0) {
            return true; // Key found
        } else if (key.compareTo(root.key) < 0) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    /*
        @desc: display bst in-order(recursive call)
        @params: root node
        @return: void
     */
    public void displayInOrder(MyBinaryNode<K> root) {
        if (root != null) {
            displayInOrder(root.left);
            System.out.print(root.key + " ");
            displayInOrder(root.right);
        }
    }
}
