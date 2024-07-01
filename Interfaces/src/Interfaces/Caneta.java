package Interfaces;

public interface Caneta {
	public void escrever(String texto); 
	
	public String getCor();
	
	default void escreverComunATodas() {
		System.out.println("Escrever igual a todas");
	}
	}
	



