package Map.Ordination.Domain;

public class Event {
    //Attributes
    private String name;
    private String attraction;

    public Event (String name,String attraction){
        this.name = name;
        this.attraction = attraction;
    }

    // getters
    public String getName() {
        return name;
    }
    public String getAttraction() {
        return attraction;
    }

    // To string
    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", attraction='" + attraction + '\'' +
                '}';
    }
}
