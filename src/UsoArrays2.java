package array;

import java.util.Scanner;

public class UsoArrays2 {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		String [] paises = new String[5];
		
		
		
		for(int i=0; i<paises.length; i++) {
			System.out.println("Dime un pa�s");
			String pais = sc.nextLine();
			paises[i]=pais;
		}
		
		
		String [] miMarca = new String[8];
		String [] Paises = new String[5];
		String [] miMarca1 = {"Ferrari","Macherati","Wolskwagen","Toyota","Mazda","Ford","Mclaren","Renault"};
		String [] Paises1 = {"Espa�a","Alemania","Francia","Venezuela","Noruega"};
		
		
		for (String nuevaString : Paises) {
			System.out.println("Pa�s " + nuevaString);
		}
		
		
		
		
		/*
		for (int i1 = 0; i1 < miMarca1.length; i1++) {
			 System.out.println("mi matriz en el index "+ i1 + " es " +miMarca1[i1]);
		}
			*/
		for (String nuevoString: miMarca1) {
			System.out.println("Marca " + nuevoString);
		}
	
	
	}

}
