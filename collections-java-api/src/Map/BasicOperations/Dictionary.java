package Map.BasicOperations;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    //Attribute
    private Map<String, String> dictionaryMap;

    public Dictionary() {
        this.dictionaryMap = new HashMap();
    }

    //Methods
    public void addWord(String word, String definition){
        dictionaryMap.put(word, definition);
    }

    public void removeWord(String word){
        if (!dictionaryMap.isEmpty()){
            dictionaryMap.remove(word);
        } else {
            System.out.println("The dictionary is empty!");
        }
    }

    public void showWords(){
        if (!dictionaryMap.isEmpty()) {
            System.out.println(dictionaryMap);
        } else {
            System.out.println("The dictionary is empty!");
        }
    }

    public String searchByWord(String word){
        String definition = dictionaryMap.get(word);
        if (definition !=null) {
            return definition;
        }
        return "Word don't found in dictionary!";
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        // Adding words (programming languages)
        dictionary.addWord("java", "Object-oriented programming language.");
        dictionary.addWord("typescript", "Superset of the JavaScript language that adds static typing.");
        dictionary.addWord("kotlin", "Modern programming language for the JVM.");

        // Show all words
        dictionary.showWords();

        // Search words
        String definitionJava = dictionary.searchByWord("java");
        System.out.println("Definition of the language 'java': " + definitionJava);

        String definitionCSharp = dictionary.searchByWord("csharp");
        System.out.println(definitionCSharp);

        // Removing a word
        dictionary.removeWord("typescript");
        dictionary.showWords();

    }
}
