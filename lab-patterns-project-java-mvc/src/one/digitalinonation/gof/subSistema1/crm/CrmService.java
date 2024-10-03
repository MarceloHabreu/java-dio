package one.digitalinonation.gof.subSistema1.crm;

public class CrmService {
    public CrmService() {
        super();
    }

    public static void saveClient(String name, String cep, String city, String state) {
        System.out.println("Client save in site of CRM: ");
        System.out.println(name);
        System.out.println(cep);
        System.out.println(city);
        System.out.println(state);
    }
}
