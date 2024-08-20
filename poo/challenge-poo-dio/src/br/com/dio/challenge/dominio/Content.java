package br.com.dio.challenge.dominio;

public abstract class Content {
    // Attributes
    protected static final double XP_PATTERN = 10; //All constant need of 'final'

    private String title;
    private String description;
    public abstract double calculateXp();

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
