package trecho;

public class Avenida extends Trecho{

	public Avenida(String nome) {
		super(nome);
	}
	
	public String getTrecho() {
		return "Avenida " + super.getNomeTrecho();
	}
}
