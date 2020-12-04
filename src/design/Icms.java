package design;

public class Icms implements Imposto{

	@Override
	public double Calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.01;
	}
}
