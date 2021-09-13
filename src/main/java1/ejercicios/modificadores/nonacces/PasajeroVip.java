package ejercicios.modificadores.nonacces;

public class PasajeroVip extends Pasajero{
	
	private final String ticket = "Pasajero Vip";
	
	// Método final no puede ser heredarse
	protected final void obtenerSeccionExclusiva() {
		System.out.println("Tiene acceso a la sección exclusiva");
	}
	
	public void obtenerAsientosPrimeraClase() {
		System.out.println("Tiene acceso a los asientos VIP");
	}
	
	protected void realizarReservaDePuesto() {
		System.out.println("Puede reservar asientos VIP");
	}
	

}
