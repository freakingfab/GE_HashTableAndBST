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
        @desc: calls function for add node
        @params: Key of node
        @return: void
     */
    public void addNode(K key){
        root = addNodeRecursive(root, key);
    }

    /*
        @desc: adds node in bst(recursive) implementation
        @params: key to be inserted
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
        @desc: calls for recurive display
        @params: none
        @return: void
     */
    public void displayInOrder(){
        displayInOrderRec(root);
    }

    /*
        @desc: display bst in-order(recursive call)
        @params: none
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
