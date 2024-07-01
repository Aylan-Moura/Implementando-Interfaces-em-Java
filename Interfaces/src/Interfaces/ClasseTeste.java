package Interfaces;
import Interfaces.CanetaEsferografica;
import Interfaces.Caneta;
import java.util.list;


public class ClasseTeste {
public static void main (String args[]) {
	Caneta caneta = new CanetaEsferografica();
	caneta.escrever( "Olaá rodrigo");
	System.out.println(caneta.getCor());
	
	Caneta giz = new Giz();
	giz.escrever( "Olaá rodrigo");
	System.out.println(giz.getCor());
	
	Caneta lapis = new Lapis();
	lapis.escrever( "Olaá rodrigo");
	System.out.println(lapis.getCor());
	
	Carro carro = new CarroPasseio();
	carro.andar();
	carro.parar();
	
	Carro caminhao = new Caminhao();
	caminhao.andar();
	caminhao.parar();
	
}
}
