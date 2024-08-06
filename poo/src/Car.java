public class Car extends Vehicle{
    
    public void connect() {
        CheckExchange();
        CheckFuel();
        System.out.println("CAR CONNECTED");
    }
    private void CheckFuel(){
        System.out.println("Checking fuel");
    }
    private void CheckExchange(){
        System.out.println("Checking the exchange rate in P");
    }
}
