public class Racetrack {
  public static void main(String[] args) {
    Car jeep = new Car();
    jeep.setChassis("89987"); 
    jeep.connect();

    Motorcycle z400 = new Motorcycle();
    z400.setChassis("23232");
    z400.connect();

    Vehicle joker = jeep;

    joker.connect();
    }
}