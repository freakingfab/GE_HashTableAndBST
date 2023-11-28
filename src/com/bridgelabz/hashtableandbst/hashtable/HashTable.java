package com.bridgelabz.hashtableandbst.hashtable;
import java.util.LinkedList;

/*
    @desc: implements features for hash table
 */
public class HashTable<K,V>{
    private LinkedList<MyMapNode<K, V>>[] bucketArray;
    private int numBuckets;

    /*
        @desc: constructor for the class
        @param: no. of buckets
        @return: none
     */
    public HashTable(int numBuckets) {
        this.numBuckets = numBuckets;
        this.bucketArray = new LinkedList[numBuckets];
        for (int i = 0; i < numBuckets; i++) {
            bucketArray[i] = new LinkedList<>();
        }
    }

    /*
        @desc: provide bucket index for given key
        @param: key
        @return: index(int)
     */
    public int getBucketIndex(K key){
        int hashCode = key.hashCode();
        return (hashCode%numBuckets);
    }

    /*
        @desc: gets the value from key
        @params: key
        @return: V
     */
    public V get(K key){
        int index = getBucketIndex(key);
        LinkedList<MyMapNode<K,V>> bucket = bucketArray[index];

        for (MyMapNode<K,V> node: bucket){
            if(node.key.equals(key)){
                return node.value;
            }
        }
        return null;
    }

    /*
        @desc: puts the key-value pair in map
        @param: key and value
        @return: void
     */
    public void put(K key, V value){
        int index = getBucketIndex(key);
        LinkedList<MyMapNode<K,V>> bucket = bucketArray[index];

        for (MyMapNode<K,V> node: bucket){
            if(node.key.equals(key)){
                node.value=value;
                return;
            }
        }
        MyMapNode<K,V> node = new MyMapNode<K,V>(key,value);
        bucket.add(node);
    }

    /*
        @desc: print the map
        @params: none
        @return: void
     */
    public void getFrequency(){
        for (int i=0;i<numBuckets;i++){
            LinkedList<MyMapNode<K,V>> bucket = bucketArray[i];
            for (MyMapNode<K,V> node: bucket){
                System.out.println(node.key + " : " + node.value);
            }
        }
    }
}
