package Map.Ordination.Test;
import Map.Ordination.Domain.Event;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class ScheduleEvents {
    // Attributes
    private Map<LocalDate, Event> eventsMap;

    public ScheduleEvents() { this.eventsMap = new HashMap<>(); }

    public void addEvent(LocalDate date, String name, String attraction){
        Event event = new Event(name,attraction);
        eventsMap.put(date, event);
    }

    public void showSchedule() {
        Map<LocalDate, Event> eventsTreeMap = new TreeMap<>(eventsMap);
        System.out.println(eventsTreeMap);
    }

    public void getNextEvent(){
        // Set<LocalDate> dateSet = eventsMap.keySet();
        // Collections<Event> values = eventsMap.values();
        // eventsMap.get();

        LocalDate dateCurrent = LocalDate.now();
        LocalDate nextDate = null;
        Event nextEvent = null;
        Map<LocalDate, Event> eventsTreeMap = new TreeMap<>(eventsMap);
        for (Map.Entry<LocalDate, Event> entry : eventsTreeMap.entrySet()){
            if (entry.getKey().isEqual(dateCurrent) || entry.getKey().isAfter(dateCurrent)){
                nextDate = entry.getKey();
                nextEvent = entry.getValue();
                System.out.println("The next event: "+ nextEvent + " will take place on the date " + nextDate);
                break;
            }
        }
    }

    public static void main(String[] args) {
        ScheduleEvents scheduleEvents = new ScheduleEvents();

        // Adding events
        scheduleEvents.addEvent(LocalDate.of(2025, Month.JULY, 15), "Event 1", "Attraction 1");
        scheduleEvents.addEvent(LocalDate.of(2025, 7, 9), "Event 2", "Attraction 2");
        scheduleEvents.addEvent(LocalDate.of(2025, Month.JANUARY, 10), "Event 3", "Attraction 3");
        scheduleEvents.addEvent(LocalDate.of(2024, Month.AUGUST, 18), "Event 4", "Attraction 4");
        scheduleEvents.addEvent(LocalDate.of(2024, Month.AUGUST, 12), "Event 5", "Attraction 5");

        // Showing all events
        scheduleEvents.showSchedule();

        // Showing the next event
        scheduleEvents.getNextEvent();
    }
}
