package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Porgrama {

	public static void main(String[] args) {
		
		List<TaxPayer> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o número de contribuintes: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Informações do contribuinte #" + i + ":");
			System.out.println("Individual ou Compania? (i/c)");
			char resp = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.println("Rendimento anual: ");
			double rendimentoAnual = sc.nextDouble();
			if(resp == 'i') {
				System.out.print("Gastos com saúde: ");
				double gastosComSaude = sc.nextDouble();
				TaxPayer contaInd = new Individual(nome, rendimentoAnual, gastosComSaude);
				lista.add(contaInd);
			} else {
				System.out.println("número de funcionários: ");
				int numeroFuncionarios = sc.nextInt();
				TaxPayer contaComp = new Company(nome, rendimentoAnual, numeroFuncionarios);
				lista.add(contaComp);
			}
		}
		
		double soma = 0.0;
		for(TaxPayer tp : lista) {
			double taxa = tp.tax();
			System.out.println("nome" + tp.getNome() + String.format("%.2f",tp.tax()));
			soma += taxa;
		}
		
		System.out.println("Soma das taxas: " + String.format("%.2f", soma));
		
		sc.close();
	}

}
