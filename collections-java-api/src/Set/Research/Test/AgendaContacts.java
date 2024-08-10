package Set.Research.Test;

import Set.Research.Domain.Contact;

import java.util.HashSet;
import java.util.Set;

public class AgendaContacts {
    // Attributes
    private Set<Contact> contactSet;

    public AgendaContacts() {
        this.contactSet = new HashSet<>();
    }

    // Methods
    public void addContact(String name, int number) {
        contactSet.add(new Contact(name, number));
    }

    public void showContact() {
        System.out.println(contactSet);
    }

    public Set<Contact> searchByName(String name) {
        Set<Contact> contactByName = new HashSet<>();
        for (Contact c : contactSet) {
            if (c.getName().startsWith(name)) {
                contactByName.add(c);
            }
        }
        return contactByName;
    }

    public Contact updateContactNumber(String name, int newNumber) {
        Contact contactUpdated = null;
        for (Contact c : contactSet) {
            if (c.getName().equalsIgnoreCase(name)) {
                c.setNumber(newNumber);
                contactUpdated = c;
                break;
            }
        }
        return contactUpdated;
    }

    public static void main(String[] args) {
        // Creating an instance of the class AgendaContacts
        AgendaContacts agendaContacts = new AgendaContacts();

        // Displaying the contacts in the set (should be empty)
        agendaContacts.showContact();

        // Adding contacts to the contact book
        agendaContacts.addContact("João", 123456789);
        agendaContacts.addContact("Marcelo", 987654321);
        agendaContacts.addContact("Marcelo", 987654321);
        agendaContacts.addContact("Marcelo Henrique", 55555555);
        agendaContacts.addContact("Ana", 88889999);
        agendaContacts.addContact("Fernando", 77778888);
        agendaContacts.addContact("Carolina", 55555555);

        // Displaying the contacts in the contact book
        agendaContacts.showContact();

        // Searching for contacts by name
        System.out.println(agendaContacts.searchByName("Ana"));
        System.out.println(agendaContacts.searchByName("Marcelo Henrique"));
        System.out.println(agendaContacts.searchByName("Fernando"));

        // Updating a contact's number
        Contact updatedContact = agendaContacts.updateContactNumber("Carolina", 44443333);
        System.out.println("Updated contact: " + updatedContact);

        Contact updatedContact2 = agendaContacts.updateContactNumber("Marcelo", 84942735);
        System.out.println("Updated2 contact: " + updatedContact2);

        // Displaying the updated contacts in the contact book
        System.out.println("Contacts in the contact in Agenda after update:");
        agendaContacts.showContact();
    }
}