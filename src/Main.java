import com.bridgelabz.hashtableandbst.hashtable.HashTable;
import com.bridgelabz.hashtableandbst.bst.BinarySearchTree;
public class Main {
    public static void main(String[] args) {
        /*
//         For hashmap
        System.out.println("Implementing hash table using linked list");
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words = paragraph.toLowerCase().split("\\s+");

        HashTable<String,Integer> wordMap = new HashTable<>(20);
        for(String word: words){
            Integer frequency = wordMap.get(word);

            if(frequency==null){
                wordMap.put(word,1);
            }
            else{
                wordMap.put(word,frequency+1);
            }
        }

        wordMap.getFrequency();

        wordMap.remove("avoidable");
        System.out.println("Frequency after removing avoidable as key");
        wordMap.getFrequency();
    }

         */

//        For BST
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.addNode(56);
        bst.addNode(30);
        bst.addNode(70);
        System.out.println("Binary Search Tree (In-Order):");
        bst.displayInOrder();
}
}