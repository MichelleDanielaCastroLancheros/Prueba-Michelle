package divisas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Divisas {
	
 public Divisas() {
	// TODO Auto-generated constructor stub
	 Divisas d = new Divisas();
}
 	static Scanner b = new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("ingrese el valor:");
		double monedaCol = b.nextDouble();
		
		CambioMoneda c = new CambioMoneda();
		
		System.out.println("Su valor en dolares es: $ " +c.divisaDolar(monedaCol));
		System.out.println("Su valor en euros es: € " +c.divisaEuro(monedaCol));
		System.out.println("Su valor en dolares es: £ " +c.divisaLibrasE(monedaCol));
	}
}
