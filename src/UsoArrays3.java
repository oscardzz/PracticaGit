package array;

public class UsoArrays3 {
	//ejercicio cuatro nueva rama
	public static void main(String[] args) {
	//generar  un array con 200 posiciones cuyos valores sean numeros aleatorios
		
			double [] aleatorio = new double[200];
		
			
			for (int i1 = 0; i1 < aleatorio.length; i1++) {
					aleatorio[i1] = Math.random()*aleatorio.length;
	}
			for (double nuevodouble: aleatorio) {
				System.out.println("Mi matriz  es " + nuevodouble);
				System.out.println("Mi matriz  es " + nuevodouble);
				System.out.println("Mi matriz  es " + nuevodouble);

				
			}
		
	}
}
