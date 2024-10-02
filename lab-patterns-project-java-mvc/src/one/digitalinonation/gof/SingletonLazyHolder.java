package one.digitalinonation.gof;
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
