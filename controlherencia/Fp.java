package controlherencia;
public class Fp extends Beca{

	private int numfp=0;
	private String ciudadDeOrigen;
	
	
	
	public Fp(String dnialumno, double renta, String ciudadDeOrigen) {
		super(dnialumno, renta);
		this.numfp = numfp;
		numfp++;
		this.codigo=codigo;
		codigo="FP"+(numfp);
		this.ciudadDeOrigen = ciudadDeOrigen;
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





}
