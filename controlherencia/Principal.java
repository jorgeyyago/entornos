package controlherencia;
import java.util.*;

public class Principal {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Vector <Beca> becas=new Beca();
		int numBecas=0;
		String tipo,origen;
		int menu;
		int becasfps=0;
		int becasfp=0;
		int media;
		double renta;
		
		
		
		
		do{
			
			
				System.out.println("Dni del solicitante: ");
				String dni=sc.nextLine();
				
				int encontrado=buscarDni(dni, becas, numBecas);
				
				if(encontrado == -1){
					System.out.println("Renta percápita del solicitante: ");
					 renta=sc.nextDouble();
					sc.nextLine();
					do {
					System.out.println("anote el tipo de beca que desea solicitar fp/l");
					tipo=sc.nextLine();
					}while(tipo.equalsIgnoreCase("fp") || tipo.equalsIgnoreCase("l"));
					if (tipo.equalsIgnoreCase("fp")){
					System.out.println("anota la ciudad de origen");
					origen=sc.nextLine();
						becas[numBecas]=new Fp(dni, renta,origen);
						numBecas++;
		}
					if (tipo.equalsIgnoreCase("l")) {
						System.out.println("anota la nota media");
						media=sc.nextInt();
						becas[numBecas]=new Libros(dni,renta,media);
						numBecas++;
					}
					
						
				}
				else
					System.out.println("Este alumno ya ha hecho una solicitud");
				
				if (numBecas==MAXBECAS)
					break;
				System.out.println("Añadir otra solicitud:1. Si\n2. No");
				menu=sc.nextInt();
				sc.nextLine();
		}while(menu==1);
		
		System.out.println("Damos puntuación a las becas*************");
		
		for(int cont=0; cont < numBecas; cont++){
			becas[cont].darPuntuacion();
			System.out.println(becas[cont].toString());	
		}
		
		System.out.println("Ordenamos las becas por puntos, y a puntos iguales por menos renta***********");
		int j,k;
		Beca aux;
		for(j = 1; j < numBecas; j++)
			for(k = 0; k < numBecas-1; k++){
				
				if(becas[k].getPuntuacion() < becas[k+1].getPuntuacion()  || 
				   becas[k].getPuntuacion() == becas[k+1].getPuntuacion() && becas[k].getRenta() > becas[k+1].getRenta()){
					
					aux=becas[k];
					becas[k]=becas[k+1];
					becas[k+1]= aux;				
				}
				
			}
		System.out.println("asfcvszv");
		for(int i=0;i<becasfps;i++)
		if (becas[i] instanceof Fp) {
			becasfp=(Fp)becas[i].getPuntuacion();
				if (becasfp==0)
					System.out.println(becas[i].toString());
					becas[i]=null
				for (int k=i;k<numfp-1;k++){ 	
	                becas[k]=becas[k+1]; 
	                becasfps--;
	                numBecas--; 
				}
		}
		
		
		
		for(int cont=0; cont < numBecas; cont++)
			System.out.println(becas[cont]);
		System.out.println("mostramos toda la informacion completa de todas las becas");{
		for(int i=0;i<numBecas;i++) {
			System.out.println(becas[i].toString());
		}
	}}

	System.out.println("esto esta para4156475 que de conflicto");
	public static int buscarDni(String dni, Beca becas[],int tam){
		
		for(int cont=0; cont < tam;cont++)
			if(becas[cont].getDnialumno().equals(dni))
				return cont;
		return -1;
	}
	
	
	
}
