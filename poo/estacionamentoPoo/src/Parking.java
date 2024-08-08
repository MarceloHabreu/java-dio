public interface Parking{
  void park(String plate, String model);
  void remove(String plate);
  boolean checkAvailability();
}