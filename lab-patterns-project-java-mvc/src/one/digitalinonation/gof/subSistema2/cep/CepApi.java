package one.digitalinonation.gof.subSistema2.cep;

import one.digitalinonation.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    // Constructor
    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String getCity(String cep) {
        return "Caxias";
    }

    public String getState(String cep) {
        return "MA";
    }
}
