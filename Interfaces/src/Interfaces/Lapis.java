package Interfaces;

public class Lapis implements Caneta {

	@Override
	public void escrever(String texto) {
		// TODO Auto-generated method stub
		System.out.println("Escrevendo o valor" + "na classe" + getClass().getSimpleName());
	}


	@Override
	public String getCor() {
		// TODO Auto-generated method stub
		return "Preto claro";
	}

}
