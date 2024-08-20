package br.com.dio.challenge.dominio;

import java.time.LocalDate;

public class Mentoring extends Content{
    // Attributes
    private LocalDate date;

    //Constructor
    public Mentoring() {
    }
    //Method
    @Override
    public double calculateXp() {
        return XP_PATTERN + 20;
    }

    //Getters and Setters
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
