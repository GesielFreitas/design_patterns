package main;

import trecho.Avenida;
import trecho.Caminho;
import trecho.Rodovia;
import trecho.Rua;

public class Main {

	public static void main(String[] args) {
		
		Rua rua = new Rua("Amaral Raposo");
		Avenida avenida = new Avenida("Hilton Nunes");
		Rodovia rodovia = new Rodovia("Leste sul");
		
		Caminho caminho = new Caminho("Grajaú para Brasília");
		
		caminho.addTrecho(rua);
		caminho.addTrecho(avenida);
		caminho.addTrecho(rodovia);
		caminho.contruirRota();
		System.out.println("------------");
		caminho.removeTrecho(rua);
		caminho.contruirRota();

	}

}
