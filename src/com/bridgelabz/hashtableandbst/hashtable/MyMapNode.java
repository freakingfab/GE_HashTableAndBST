package com.bridgelabz.hashtableandbst.hashtable;

/*
    @desc: node for the map
 */
public class MyMapNode<K,V>{
    K key;
    V value;

    /*
        @desc: constructor for the class
        @params: key and value for node
        @return: none
     */
    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
