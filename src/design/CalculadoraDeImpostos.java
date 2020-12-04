package design;

public class CalculadoraDeImpostos {

	public void realizarCalculo(Orcamento orcamento, Imposto impostoQualquer) {
	
			double valor = impostoQualquer.Calcula(orcamento);
			System.out.println(valor);
	
	}

}
