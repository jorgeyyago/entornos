package controlherencia;
public class Libros extends Beca{

	private int numLibros=0;
	private double notaMedia;
	

	
	
	public Libros(String dnialumno, double renta, double notaMedia) {
		super(dnialumno, renta);
		this.numLibros = numLibros;
		numLibros++;
		this.codigo=codigo;
		codigo="LI"+numLibros;
		this.notaMedia = notaMedia;
		
		
		public int darPuntuacion() {
			if (notaMedia>=7 && notaMedia <=8) {
				puntuacion=puntuacion+1;
			}
			if (notaMedia>=9 && notaMedia <=10)
				puntuacion=puntuacion+2;
			if(renta < 6000)
				puntuacion=2;
			
			return puntuacion;
		}




		@Override
		public String toString() {
		return "Libros [numLibros=" + numLibros + ", notaMedia=" + notaMedia + ", codigo=" + codigo + ", toString()="
				+ super.toString() + "]";
		}
	
	
	
}
