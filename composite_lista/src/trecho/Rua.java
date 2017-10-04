package trecho;

public class Rua extends Trecho{
	
	public Rua(String nome) {
		super(nome);
	}
	
	public String getTrecho() {
		return "Rua " + super.getNomeTrecho();
	}

}
