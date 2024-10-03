package one.digitalinonation.gof.strategy;

public class Robot {

    private Behavior behavior;

    public void setBehavior(Behavior strategy) {
        this.behavior = strategy;
    }

    public void toMove(){
        behavior.toMove();
    }
}
