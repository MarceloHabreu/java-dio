package br.com.dio.challenge.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate endDate =  startDate.plusDays(45);
    private Set<Dev> devsSubscribers = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Set<Dev> getDevsSubscribers() {
        return devsSubscribers;
    }

    public void setDevsSubscribers(Set<Dev> devsSubscribers) {
        this.devsSubscribers = devsSubscribers;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    //Equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(startDate, bootcamp.startDate) && Objects.equals(endDate, bootcamp.endDate) && Objects.equals(devsSubscribers, bootcamp.devsSubscribers) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, startDate, endDate, devsSubscribers, contents);
    }
}
