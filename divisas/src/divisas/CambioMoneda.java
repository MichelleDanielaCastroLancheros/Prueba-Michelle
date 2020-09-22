package divisas;

public class CambioMoneda {

public CambioMoneda() {
	// TODO Auto-generated constructor stub
}	

	double divisaDolar;
	double divisaEuro;
	double divisaLibrasE;
	
	
	public double divisaDolar(double monedaCol) {
		
		divisaDolar = monedaCol / 3000.00;
		
		return divisaDolar;
		
	}
	
	public double divisaEuro(double monedaCol) {
		
		divisaEuro = monedaCol / 3864.34;
		
		return divisaEuro;
		
	}
	
	public double divisaLibrasE(double monedaCol) {
		
		divisaLibrasE = monedaCol / 4438.09;
		
		return divisaLibrasE;
		
	}


}
