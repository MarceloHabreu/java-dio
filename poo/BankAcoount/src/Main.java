
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Marcelin");
		
		Conta cc = new ContaCorrente(Marcelin);
		Conta poupanca = new ContaPoupanca(Marcelin);

		cc.depositar(300);
		cc.transferir(200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
