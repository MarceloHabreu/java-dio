package br.com.dio.challenge.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> ContentSubscribers = new LinkedHashSet<>();
    private Set<Content> contentCompleted = new LinkedHashSet<>();

    //Methods
    public void RegisterBootcamp(Bootcamp bootcamp){}
    public void progress(){}
    public void calculatedTotalXp(){}

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getContentSubscribers() {
        return ContentSubscribers;
    }

    public void setContentSubscribers(Set<Content> contentSubscribers) {
        ContentSubscribers = contentSubscribers;
    }

    public Set<Content> getContentCompleted() {
        return contentCompleted;
    }

    public void setContentCompleted(Set<Content> contentCompleted) {
        this.contentCompleted = contentCompleted;
    }

    //Equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(ContentSubscribers, dev.ContentSubscribers) && Objects.equals(contentCompleted, dev.contentCompleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ContentSubscribers, contentCompleted);
    }
}
