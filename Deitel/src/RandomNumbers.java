import java.util.Random;



public class RandomNumbers {

	public static void main(String[] args) {
		//
		
		Random randomNumbers = new Random();
		
		// PUEDO LLAMAR A ESTA SENTENCIA PARA DECIRLE EN CUALQUIER MOMENTO QUE ACTUALICE EL SEED, así no se entra en una rutina de numeros iguales
		randomNumbers.set( seedValue );
		
		int randomValue = 0;
		
		
		randomValue = randomNumbers.nextInt();
		System.out.println("Random method nextInt generates a random int value in the range –2,147,483,648 to +2,147,483,647, inclusive");
		System.out.println(randomValue);
		
	
		// En este ejemplo pues el resultado podrá ser: 0, 1, 2, 3, 4, 5
		randomValue = randomNumbers.nextInt(6);
		System.out.println("Random Value entre '0' y el numero que ponga dentro del () ");
		System.out.println(randomValue);
		
		
		//Ahora para simular un dado (1-6)
		randomValue = 1 + randomNumbers.nextInt(6);
		System.out.println("Dado (1-6): " + randomValue);
		
		
		
	}

}
