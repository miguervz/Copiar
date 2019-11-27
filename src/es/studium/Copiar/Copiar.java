package es.studium.Copiar;

import java.util.Scanner;

public class Copiar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String cadena1,cadena2;
		System.out.println("Escribe la cadena");
		cadena1=teclado.next();
	cadena2=cadena1;
	System.out.println(cadena2);
	teclado.close();
	

	}

}
