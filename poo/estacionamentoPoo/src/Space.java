public interface Space {
    int getNumber();
    boolean isBusy();
    void occupy(String plate);
    void vacate();
    Vehicle getVehicle();
}