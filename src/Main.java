import com.bridgelabz.hashtableandbst.hashtable.HashTable;

public class Main {
    public static void main(String[] args) {
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
    }
}