package trecho;

import java.util.ArrayList;
import java.util.List;

public class Caminho extends Trecho{
	
	List<Trecho> trecho = new ArrayList<Trecho>();
	
	public Caminho(String nome) {
		super(nome);
	}
	
	public void addTrecho(Trecho trecho) {
		this.trecho.add(trecho);
	}
	
	public void removeTrecho(Trecho trecho) {
		this.trecho.remove(trecho);
	}
	
	public String getTrecho() {
		return "Caminho " + super.getNomeTrecho();
	}
	
	public void contruirRota() {
		System.out.println("A rota que vc deve seguir é composta pelo " + this.getTrecho() + " o qual é composto por: ");
		for(Trecho tr: trecho) {
			System.out.println(tr.getTrecho());
		}
		System.out.println("Tenha uma boa viagem!!!");
	}
}
