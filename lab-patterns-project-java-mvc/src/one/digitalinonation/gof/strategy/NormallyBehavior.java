package one.digitalinonation.gof.strategy;

public class NormallyBehavior implements Behavior {

    @Override
    public void toMove() {
        System.out.println("Moving normally...");
    }
}
