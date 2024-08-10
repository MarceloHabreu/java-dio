package Set.BasicOparations.Domain;

import java.util.Objects;

public class Guest {
    // Attributes
    private String name;
    private int invitationCode;

    // Constructor
    public Guest(String name, int invitationCode) {
        this.name = name;
        this.invitationCode = invitationCode;
    }

    // Getters:
    public String getName() {
        return name;
    }

    public int getInvitationCode() {
        return invitationCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return invitationCode == guest.invitationCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(invitationCode);
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", invitationCode=" + invitationCode +
                        '}';
    }
}
