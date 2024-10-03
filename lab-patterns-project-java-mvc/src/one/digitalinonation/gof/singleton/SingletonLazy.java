package one.digitalinonation.gof.singleton;
/*
*  Singleton "preguiçoso"
*
*
* */
public class SingletonLazy {
    private static SingletonLazy instancia;

    // Constructor
    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
