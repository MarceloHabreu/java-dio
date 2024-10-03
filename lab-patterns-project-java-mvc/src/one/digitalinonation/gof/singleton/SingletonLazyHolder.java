package one.digitalinonation.gof.singleton;

/*
 *  Singleton "Lazy Holder"
 *
 *
 * */
public class SingletonLazyHolder {

    private static class InstataceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    // Constructor
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstataceHolder.instancia;
    }
}
