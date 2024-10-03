package one.digitalinonation.gof.singleton;
/*
*  Singleton "apressado"
*
*
* */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    // Constructor
    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
