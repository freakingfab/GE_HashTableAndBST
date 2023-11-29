import com.bridgelabz.hashtableandbst.bst.MyBinaryNode;
import com.bridgelabz.hashtableandbst.hashtable.HashTable;
import com.bridgelabz.hashtableandbst.bst.BinarySearchTree;
import com.bridgelabz.hashtableandbst.hashtable.MyMapNode;

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
        bst.addNode(22);
        bst.addNode(40);
        bst.addNode(60);
        bst.addNode(95);
        bst.addNode(65);
        bst.addNode(63);
        bst.addNode(67);
        System.out.println("Original Binary Search Tree (In-Order):");
        bst.displayInOrder(bst.getRoot());
        System.out.println();
        System.out.println("Height of Tree: " + bst.height(bst.getRoot()));
        System.out.println("Size of Tree: " + bst.size(bst.getRoot()));

        BinarySearchTree<Integer> subTree = new BinarySearchTree<Integer>();
        subTree.addNode(11);
        subTree.addNode(3);
        subTree.addNode(16);

        bst.addSubtree(bst.getRoot(),subTree.getRoot());
        System.out.println("After Binary Search Tree (In-Order):");
        bst.displayInOrder(bst.getRoot());
        System.out.println();
        System.out.println("Height of Tree: " + bst.height(bst.getRoot()));
        System.out.println("Size of Tree: " + bst.size(bst.getRoot()));

        boolean found = bst.search(bst.getRoot(), 40);
        if (found) {
            System.out.println("Key 40 is present in the BST.");
        } else {
            System.out.println("Key 40 is not present in the BST.");
        }

}
}