package ejercicios.nonaccess.finall;

public class EstudianteOdontologia extends EstudianteMedicina {

	@Override
// No se puede sobreescribir el m�todo final de la clase padre
	public void realizarPracticas() {
		System.out.println("Realiza 100 de pr�cticas");
	}

	protected void realizarPasantias() {
		System.out.println("Realiza 200 pasant�as");
	}

}
