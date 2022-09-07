package entities;

public class Company extends TaxPayer{
	
	private int numeroFuncionarios;
	
	public Company() {
	}

	public Company(String nome, Double rendimentoAnual, int numeroFuncionarios) {
		super(nome, rendimentoAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public Double tax() {
		if(numeroFuncionarios < 10 ) {
			return rendimentoAnual - (rendimentoAnual * 0.16);
		}else {
			return rendimentoAnual - (rendimentoAnual * 0.14);
		}
	}
}
