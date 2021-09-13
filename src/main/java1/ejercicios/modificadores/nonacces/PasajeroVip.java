package ejercicios.modificadores.nonacces;

public class PasajeroVip extends Pasajero{
	
	private final String ticket = "Pasajero Vip";
	
	// M�todo final no puede ser heredarse
	protected final void obtenerSeccionExclusiva() {
		System.out.println("Tiene acceso a la secci�n exclusiva");
	}
	
	public void obtenerAsientosPrimeraClase() {
		System.out.println("Tiene acceso a los asientos VIP");
	}
	
	protected void realizarReservaDePuesto() {
		System.out.println("Puede reservar asientos VIP");
	}
	

}
