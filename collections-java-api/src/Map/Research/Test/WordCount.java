package Map.Research.Test;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    // Attributes
    private Map<String, Integer> words;

    public WordCount() {
        this.words = new HashMap<>();
    }

    public void addWord(String language, Integer count){
        words.put(language, count);
    }

    public void removeWord(String word){
        if (!words.isEmpty()){
            words.remove(word);
        } else {
            System.out.println("The map is empty!");
        }
    }
    public int showWordsCount(){
        int totalCount = 0;
        for (int count : words.values()){
            totalCount += count;
        }
        return totalCount;
    }
    public String findWordsMostFrequent() {
        String languageMostFrequent = null;
        int highestCount = 0;
        for (Map.Entry<String, Integer> entry : words.entrySet()){
            if(entry.getValue() > highestCount) {
                highestCount = entry.getValue();
                languageMostFrequent = entry.getKey();
            }
        }
        return languageMostFrequent;
    }

    public static void main(String[] args) {
        WordCount countLanguages = new WordCount();

        // Adds languages and their counts
        countLanguages.addWord("Java", 2);
        countLanguages.addWord("Python", 8);
        countLanguages.addWord("Javascript", 1);
        countLanguages.addWord("C#", 6);
        countLanguages.addWord("PHP", 4);

        // Displays the total language count
        System.out.println("There are " + countLanguages.showWordsCount());

        // Finds and displays the most frequent language
        String languageMoreFrequent = countLanguages.findWordsMostFrequent();
        System.out.println("The language more frequent is: " + languageMoreFrequent);
    }

}
