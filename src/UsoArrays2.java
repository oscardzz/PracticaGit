package array;

import java.util.Scanner;

public class UsoArrays2 {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		String [] paises = new String[5];
		
		
		
		for(int i=0; i<paises.length; i++) {
			System.out.println("Dime un país");
			String pais = sc.nextLine();
			paises[i]=pais;
		}
		
		
		String [] miMarca = new String[8];
		String [] Paises = new String[5];
		String [] miMarca1 = {"Ferrari","Macherati","Wolskwagen","Toyota","Mazda","Ford","Mclaren","Renault"};
		String [] Paises1 = {"España","Alemania","Francia","Venezuela","Noruega"};
		
		
		
		
		
		
		for (String nuevoString: miMarca1) {
			System.out.println("Marca " + nuevoString);
		}
	
	
	}

}
