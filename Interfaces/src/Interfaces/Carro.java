package Interfaces;

public interface Carro {
default void parar() {/* implenta o metodo para todas as classes*/
	System.out.println("Carro está  parandoo");
}
public void andar();
}
