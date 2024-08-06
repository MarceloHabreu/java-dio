public  abstract class Vehicle {
  private String chassis;
    public String getChassis() {
      return chassis;
    }
    public void setChassis(String chassis) {
      this.chassis = chassis;
    }
    public abstract void connect();
}
