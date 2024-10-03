package one.digitalinonation.gof;

import one.digitalinonation.gof.facade.Facade;
import one.digitalinonation.gof.singleton.SingletonEager;
import one.digitalinonation.gof.singleton.SingletonLazy;
import one.digitalinonation.gof.singleton.SingletonLazyHolder;
import one.digitalinonation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("-------Tests  Sigleton-------");
        /* Tests  Sigleton */
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        System.out.println("-------Tests Strategy-------");

        /* Tests Strategy */
        Behavior defensive = new DefensiveBehavior();
        Behavior aggressive = new AggressiveBehavior();
        Behavior normally = new NormallyBehavior();

        Robot robot = new Robot();
        robot.setBehavior(defensive);
        robot.toMove();
        robot.toMove();
        robot.setBehavior(normally);
        robot.toMove();
        robot.setBehavior(aggressive);
        robot.toMove();
        robot.toMove();
        robot.toMove();

        System.out.println("-------Tests  Facade-------");
        /* Tests  Facade */
        Facade facade = new Facade();
        facade.migrateClient("Marcelo", "65609-200");
    }
}
