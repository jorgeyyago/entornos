package controlherencia;

public class Beca {

	protected String dnialumno;
	protected double renta;
	protected int puntuacion=0;
	protected static codigo;
	
		
	public Beca(String dnialumno, double renta) {
		super();
		this.dnialumno = dnialumno;
		this.renta = renta;
	}
	public int darPuntuacion() {
		if (ciudadDeOrigen.equalsIgnoreCase("madrid"))
			puntuacion=puntuacion+1;
		if(renta < 6000)
			puntuacion=puntuacion+2;
		if(renta >= 6000 && renta <= 10000)
			puntuacion=puntuacion+1;
		return puntuacion;
	}





	public int getNumfp() {
		return numfp;
	}



	@Override
	public String toString() {
		return "Fp [numfp=" + numfp + ", ciudadDeOrigen=" + ciudadDeOrigen + ", codigo=" + codigo + ", toString()="
				+ super.toString() + "]";
	}






