package Tema7;

public class Array2Dimension {

	public static void main(String[] args) {
		
		
		int array1[][]={{0,2,4,6},{1,3,5}};
		int array2[][]={{1,1,1,1},{2},{3,3,3}};
	
		System.out.println("Los valores de array 1 son:");
		imprimirArray(array1);
		System.out.println("\nLos valores de array 2 son:");
		imprimirArray(array2);
		
		
	}

	
	
	//imprime un array de 2 dimensiones 
	public static void imprimirArray( int[][] array)
	{
				
		for (int row = 0; row < array.length; row++)
		{
			for(int column = 0; column < array[row].length; column++)
			{
				System.out.printf("%d ", array[row][column]);
			}
			System.out.println();
		}
	}

	
}
