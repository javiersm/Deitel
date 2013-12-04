package CasilleroMental;


import java.util.Scanner;



public class CasilleroMental {
	
	


static String[] casillero = {"aro", "hada", "noe", "moho", "ko", "ola", "hueso", "feo", "hacha", "buho",  //0-9
								"toro", "teta", "duna", "dama", "ataque", "tala", "taza", "tufo", "toga", "tapa",
								"noria", "nata", "niño", "nemo", "nuca", "nilo", "anis", "nife", "nicho", "nabo",
								"mir" ,"moto", "mono", "momia", "moco", "miel", "mazo", "mafia", "mecha", "mapa",
								"car", "cohete", "cono", "cama", "coco", "celo", "queso", "cafe", "coche", "cepo",
								"loro", "lata", "leon", "lima", "laca", "lulu", "lazo", "lefa", "lago", "lapa",  //50-59
								"sor", "seta", "sena", "sima", "saco", "sal", "seso", "sofa", "sacho", "sapo",
								"faro", "foto", "fino", "fama", "foca", "fila", "foso", "fofo", "faja", "fobia",
								"echar", "chita", "china", "goma", "chica", "jaleo", "chis", "jefe", "chucho", "chivo",
								"bar", "bota"};
		
	private static String palabraActual = "";
	private static int tamañoCasillero = 0;
	private static int palabraRef = 0;
	private static int numeroPartida = 0;
	private static int aciertos = 0;
	private static int fallos = 0;
	private static double estadisticas = 0.0;
	
	
	public static int getRandom(){		
		int numPalabra = (int) (Math.random() * getTamañoCasillero());
		return numPalabra;
	}
	
	public static int getTamañoCasillero(){
		tamañoCasillero = casillero.length;
		return tamañoCasillero;
	}
	
	public static int getAciertos(){
		return aciertos; 
	}
	public static void setAciertos(){
		aciertos++;
	}
	
	public static int getFallos(){
		return fallos;
	}
	
	public static void setFallos(){
		fallos++;
	}
	
	public static int getNumPartida(){
		return numeroPartida;
	}
	public static void setNumPartida(){
		numeroPartida++;
	}
	
	public static double getStadistics(){
		if (getNumPartida() > 0){
			estadisticas = (double)( (getAciertos()*100) /  getNumPartida());
		}else if (getNumPartida() == 0.0){
			estadisticas = 0.0;
		}
		//System.out.print("estadisticas:" + estadisticas);
		return estadisticas;
	}
	
	public static String getHeader(){
		return String.format("\n\t\tPartida:%2d    Aciertos:%2d    Fallos:%2d    ACIERTOS[%3.2f%%] \n", getNumPartida(), getAciertos(), getFallos(), getStadistics());
	}
	
	
	public static String partidaNumeroPalabra(){
		
		palabraRef = getRandom(); // Asigno un numero aleatorio
		palabraActual = casillero[palabraRef]; //Asigno la palabra asosiada al numero aleatorio
		System.out.printf("\nNumero[%d]: ", palabraRef);
		
		
		Scanner teclado = new Scanner(System.in);
		String palabraIntroducida = teclado.nextLine();
		palabraIntroducida = palabraIntroducida.toLowerCase(); //pasamos la palabra introducida a minuscula para hacer la comparacion
		String str = "";
		
		if (palabraIntroducida.equals(palabraActual))
		{
			str = ("\t\tCorrecto.");
			CasilleroMental.setAciertos();
		}else{			
			str = String.format("\t\tErroneo(%s)", palabraActual);
			CasilleroMental.setFallos();			
		}		
		setNumPartida();
		System.out.print(str);
		return str; 
	}
	
	// ********************* MAIN *********************************
	public static void main(String[] args) {
		
		//Principal mainWindow = new Principal();
		
		do{
			System.out.print(getHeader());
			//textarea.setText(getHeader());
			//textarea.setText(partidaNumeroPalabra());
			partidaNumeroPalabra();
		}while(true);
		
	}

}
