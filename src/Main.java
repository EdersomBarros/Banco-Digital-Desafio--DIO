
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		venilton.setCpf("333.666.555-99");
		venilton.setEndereco("Campo Grande - MS");
		venilton.setTelefone("67995265885");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		Conta cInvest = new ContaInvestimento(venilton, 1.25);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		cInvest.imprimirExtrato();
	}

}
