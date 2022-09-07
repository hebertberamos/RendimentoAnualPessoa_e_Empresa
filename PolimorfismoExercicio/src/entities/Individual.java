package entities;

public class Individual extends TaxPayer {
	
	private double gastosComSaude;
	
	public Individual () {
	}

	public Individual(String nome, Double rendimentoAnual, double gastosComSaude) {
		super(nome, rendimentoAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public Double tax() {
	if(rendimentoAnual < 2000) {
		return rendimentoAnual * 0.15 - gastosComSaude * 0.5;
	}else {
		return rendimentoAnual * 0.25 - gastosComSaude * 0.5;
	}
	}
}
