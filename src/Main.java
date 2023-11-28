import com.bridgelabz.hashtableandbst.hashtable.HashTable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Implementing hash table using linked list");
        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().split("\\s+");

        HashTable<String,Integer> wordMap = new HashTable<>(10);
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
    }
}