package trecho;

public class Rodovia extends Trecho{
	
	public Rodovia(String nome) {
		super(nome);
	}
	
	public String getTrecho() {
		return "Rodovia " + super.getNomeTrecho();
	}
}
