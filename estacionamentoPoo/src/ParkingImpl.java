public class ParkingImpl implements Parking {
  // Simple array of spaces
  private Space[] spaces;

  public ParkingImpl(int numberOfSpaces) {
      spaces = new SpaceImpl[numberOfSpaces];
      for (int i = 0; i < numberOfSpaces; i++) {
          spaces[i] = new SpaceImpl(i + 1);
      }
  }

  @Override
  public void park(String plate, String model) {
      for (Space space : spaces) {
          if (!space.isBusy()) {
              space.occupy(plate);
              System.out.println("Vehicle " + model + " with plate " + plate + " parked in the parking space " + space.getNumber());
              return;
          }
      }
      System.out.println("No vacancies available.");
  }

  @Override
  public void remove(String plate) {
      for (Space space : spaces) {
          if (space.isBusy() && space.getVehicle().getPlate().equals(plate)) {
              space.vacate();
              System.out.println("Vehicle with plate " + plate + " removed from the position " + space.getNumber());
              return;
          }
      }
      System.out.println("Vehicle with plate " + plate + " not found.");
  }

  @Override
  public boolean checkAvailability() {
      for (Space space : spaces) {
          if (!space.isBusy()) {
              return true;
          }
      }
      return false;
  }

  public static void main(String[] args) {
      ParkingImpl parking = new ParkingImpl(10);
      // Testing parking features
      parking.park("ABC1234", "Car A");
      parking.park("DEF5678", "Car B");
      parking.park("DEF2378", "Car C");
      parking.park("JTF5678", "Car D");
      parking.remove("ABC1234");
      parking.remove("JTF5678");
      System.out.println("Vacancies available: " + parking.checkAvailability());
  }
}

class VehicleImpl implements Vehicle {
  private String plate;
  private String model;

  public VehicleImpl(String plate, String model) {
      this.plate = plate;
      this.model = model;
  }

  @Override
  public String getPlate() {
      return plate;
  }

  @Override
  public String getModel() {
      return model;
  }
}

class SpaceImpl implements Space {
  private int number;
  private Vehicle vehicle;

  public SpaceImpl(int number) {
      this.number = number;
  }

  @Override
  public int getNumber() {
      return number;
  }

  @Override
  public boolean isBusy() {
      return vehicle != null;
  }

  @Override
  public void occupy(String plate) {
      vehicle = new VehicleImpl(plate, "Unknown model");
  }

  @Override
  public void vacate() {
      vehicle = null;
  }

  public Vehicle getVehicle() {
      return vehicle;
  }
}
