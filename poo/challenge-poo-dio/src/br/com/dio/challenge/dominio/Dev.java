package br.com.dio.challenge.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> contentSubscribers = new LinkedHashSet<>();
    private Set<Content> contentCompleted = new LinkedHashSet<>();

    //Methods
    public void RegisterBootcamp(Bootcamp bootcamp){
        this.contentSubscribers.addAll((bootcamp.getContents()));
        bootcamp.getDevsSubscribers().add(this);
    }
    public void progress(){
        Optional<Content> content = this.contentSubscribers.stream().findFirst();
        if(content.isPresent()) {
            this.contentCompleted.add(content.get());
            this.contentSubscribers.remove((content.get()));
        } else {
            System.err.println("You are not enrolled in any content");
        }

    }
    public double calculatedTotalXp(){
        return this.contentCompleted
                .stream()
                .mapToDouble(Content::calculateXp)
                .sum();
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getContentSubscribers() {
        return contentSubscribers;
    }

    public void setContentSubscribers(Set<Content> contentSubscribers) {
        contentSubscribers = contentSubscribers;
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
        return Objects.equals(name, dev.name) && Objects.equals(contentSubscribers, dev.contentSubscribers) && Objects.equals(contentCompleted, dev.contentCompleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentSubscribers, contentCompleted);
    }
}
