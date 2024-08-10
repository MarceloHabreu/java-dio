package Set.BasicOparations.Test;

import java.util.HashSet;
import java.util.Set;

public class Uniquewords {
    private Set<String> setsUniqueWords;

    public Uniquewords() {
        // Initializing the guestSet as a new HashSet
        this.setsUniqueWords = new HashSet<>();
    }

    //Methods
    public void addWord(String word){
        this.setsUniqueWords.add(word);
    }

    public void removeWord(String word){
        if(!setsUniqueWords.isEmpty()){
            setsUniqueWords.remove(word);
        } else {
            System.out.println("Word not found in the set!");
        }
    }

    public boolean verifyWord(String word){
        return setsUniqueWords.contains(word);
    }

    public void showUniqueWords(){
        if(!setsUniqueWords.isEmpty()){
            System.out.println(setsUniqueWords);
        } else {
            System.out.println("There are no words in the whole!");
        }
    }

    public static void main(String[] args) {
        // Creating an Instance of the UniqueWordSet Class
        Uniquewords words = new Uniquewords();

        // Adding unique languages to the set
        words.addWord("Java");
        words.addWord("Python");
        words.addWord("JavaScript");
        words.addWord("Python");
        words.addWord("C++");
        words.addWord("Ruby");

        // Displaying the unique languages in the set
        words.showUniqueWords();

        // Removing a language from the set
        words.removeWord("Python");
        words.showUniqueWords();

        // Removing a non-existent language
        words.removeWord("Swift");

        // Checking if a language is in the set
        System.out.println("Is the language 'Java' in the set? " + words.verifyWord("Java"));
        System.out.println("Is the language 'Python' in the set? " + words.verifyWord("Python"));

        // Displaying the updated unique languages in the set
        words.showUniqueWords();


    }
}
