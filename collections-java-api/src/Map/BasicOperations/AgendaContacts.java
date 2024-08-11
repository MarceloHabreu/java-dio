package Map.BasicOperations;

import java.util.HashMap;
import java.util.Map;

public class AgendaContacts {
    // Attributes
    private Map<String, Integer> agendaContatcsMap;

    public AgendaContacts() {
        this.agendaContatcsMap = new HashMap<>();
    }

    //Methods
    public void addContact(String name, Integer phone){
        agendaContatcsMap.put(name, phone);
    }

    public void removeContact(String name) {
        if(agendaContatcsMap.isEmpty()) {
            agendaContatcsMap.remove(name);
        }
    }
    public void showContacts() {
        System.out.println(agendaContatcsMap);
    }

    public Integer searchByName(String name){
        Integer numberByName = null;
        if(agendaContatcsMap.isEmpty()){
            agendaContatcsMap.get(name);
        }
        return numberByName;
    }

    public static void main(String[] args) {
        AgendaContacts agendaContacts = new AgendaContacts();

        agendaContacts.showContacts();
        // Add contacts
        agendaContacts.addContact("Camila", 123456);
        agendaContacts.addContact("João", 5665);
        agendaContacts.addContact("Carlos", 1111111);
        agendaContacts.addContact("Ana", 654987);
        agendaContacts.addContact("Maria", 1111111);
        agendaContacts.addContact("Camila", 44444);

        agendaContacts.showContacts();

        // Remove a contact
        agendaContacts.removeContact("Maria");
        agendaContacts.showContacts();

        // Search for a number by name
        String searchName = "João";
        Integer searchNumber = agendaContacts.searchByName("João");
        System.out.println("Phone number for " + searchName + ": " + searchNumber);

        String nonExistentSearchName = "Paula";
        Integer nonExistentSearchNumber = agendaContacts.searchByName(nonExistentSearchName);
        System.out.println("Phone number for " + nonExistentSearchName + ": " + nonExistentSearchNumber);

    }
}
