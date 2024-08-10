package Set.BasicOparations.Domain;

import java.util.Objects;

public class Words {
    private String word;

    public Words(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Words words = (Words) o;
        return Objects.equals(word, words.word);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(word);
    }

    @Override
    public String toString() {
        return
                "word='" + word + '\'' +
                '}';
    }
}
