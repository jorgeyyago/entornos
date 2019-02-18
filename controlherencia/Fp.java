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



}
