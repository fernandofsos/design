package design;

public class Iss implements Imposto{

	@Override
	public double Calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
