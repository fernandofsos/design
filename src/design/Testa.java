package design;

public class Testa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Iss iss = new Iss();
		Imposto impostoQualquer;
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadoraDeImpostos calcualdora = new CalculadoraDeImpostos();
		
		impostoQualquer = new Iss();
		calcualdora.realizarCalculo(orcamento, impostoQualquer);

		impostoQualquer = new Icms();
		calcualdora.realizarCalculo(orcamento, impostoQualquer);

	}

}
