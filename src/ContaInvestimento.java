
public class ContaInvestimento extends Conta{
	
	private double taxaRendimento;

	public ContaInvestimento(Cliente cliente, double taxaRendimento) {
		super(cliente);
		this.taxaRendimento = taxaRendimento;
	}
	
	

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}



	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta de Investimento ===");
        super.imprimirInfosComuns();
        System.out.println(String.format("Taxa de Rendimento: %.2f%%", taxaRendimento));
		
		
	}

}
