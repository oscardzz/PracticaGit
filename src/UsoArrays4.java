package array;

public class UsoArrays4 {
	
	public static void main(String[] args) {
		
		int [][] matriz = {{1,2,3,4,6},{4,2,3,5,7},{3,5,6,8,3},{7,4,5,6,9}};
		
		
		for(int[]vector1: matriz) {
			for(int vector2: vector1) {
			System.out.println(vector2+" ");	
			}
		}
	}
}
