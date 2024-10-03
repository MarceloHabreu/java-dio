package one.digitalinonation.gof.facade;

import one.digitalinonation.gof.subSistema1.crm.CrmService;
import one.digitalinonation.gof.subSistema2.cep.CepApi;

public class Facade {
    public void migrateClient(String name, String cep) {
        String city = CepApi.getInstancia().getCity(cep);
        String state = CepApi.getInstancia().getState(cep);

        CrmService.saveClient(name, cep, city, state);
    }
}
