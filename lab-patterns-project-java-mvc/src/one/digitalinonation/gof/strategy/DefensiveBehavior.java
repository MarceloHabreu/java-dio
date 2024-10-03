package one.digitalinonation.gof.strategy;

public class DefensiveBehavior implements Behavior {
    @Override
    public void toMove() {
        System.out.println("Moving defensively....");
    }
}
