package ejercicios.modificadores.nonacces;

public class PasajeroPrimeraClase extends PasajeroVip {
	
	private String paseVip;

	// Este método es de tipo final y no puede ser utilizada en esta clase
	protected final void obtenerSeccionExclusiva() {
		System.out.println("Se obtiene acceso a la sección Exclusiva");
	}

	public void obtenerAsientosPrimeraClase() {
		System.out.println("Se obtiene acceso a los asientos de primera clase");
	}

	protected void realizarReservaDePuesto() {
		System.out.println("Se realiza una reserva de asiento VIP");
	}

}
