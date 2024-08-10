package Set.BasicOparations.Test;

import Set.BasicOparations.Domain.Guest;
import java.util.HashSet;
import java.util.Set;

public class SetGuests {
    // Attribute
    private Set<Guest> guestSet;

    public SetGuests() {
        // Initializing the guestSet as a new HashSet
        this.guestSet = new HashSet<>();
    }

    // Methods
    public void addGuest(String name, int invitationCode) {
        guestSet.add(new Guest(name, invitationCode));
    }

    public void removeGuestByInvitationCode(int invitationCode) {
        Guest guestForToRemove = null;
        for (Guest g : guestSet) {
            if (g.getInvitationCode() == invitationCode) {
                guestForToRemove = g;
                break;
            }
        }
        guestSet.remove(guestForToRemove);
    }

    public int countGuests() {
        return guestSet.size();
    }

    public void showGuests() {
        System.out.println(guestSet);
    }

    public static void main(String[] args) {
        SetGuests setGuests = new SetGuests();
        // Displaying the number of guests in the set (should be zero)
        System.out.println("There are " + setGuests.countGuests() + " guest(s) in the Guest Set");

        // Adding guests to the set
        setGuests.addGuest("Alice", 1234);
        setGuests.addGuest("Bob", 1235);
        setGuests.addGuest("Charlie", 1235);
        setGuests.addGuest("David", 1236);

        // Displaying the guests in the set
        System.out.println("Guests in the set:");
        setGuests.showGuests();

        // Displaying the updated number of guests in the set
        System.out.println("There are " + setGuests.countGuests() + " guest(s) in the Guest Set");

        // Removing a guest from the set by invitation code
        setGuests.removeGuestByInvitationCode(1236);
        System.out.println("There are " + setGuests.countGuests() + " guest(s) in the Guest Set after removal");

        // Displaying the updated guests in the set
        System.out.println("Guests in the set after removal:");
        setGuests.showGuests();
    }
}
