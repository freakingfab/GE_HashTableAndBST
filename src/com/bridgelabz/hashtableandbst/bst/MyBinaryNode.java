package com.bridgelabz.hashtableandbst.bst;

/*
    @desc: class creates node for bst
 */
public class MyBinaryNode<K extends Comparable<K>> {
    K key;
    MyBinaryNode<K> left;
    MyBinaryNode<K> right;

    /*
        @desc:constructor for the class
        @params: key of node
        @return: none
     */
    public MyBinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}
