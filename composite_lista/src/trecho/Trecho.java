package trecho;

public abstract class Trecho {
	
	String nomeTrecho;
	
	public Trecho(String nome) {
		setNomeTrecho(nome);
	}
	
	public void setNomeTrecho(String nometrecho) {
		if(nometrecho.length() > 3) {
			this.nomeTrecho = nometrecho;
		}else {
			System.out.println("Não foi possível validar o nome");
		}
	}
	
	public String getNomeTrecho() {
		return this.nomeTrecho;
	}
	
	public abstract String getTrecho();
	
	public void addTrecho(Trecho trecho) {
		System.out.println("Este trecho não pode ser composto por outro trecho");
	}
	
	public void removeTrecho(Trecho trecho) {
		System.out.println("Este trecho não pode ser removido");
	}

}
