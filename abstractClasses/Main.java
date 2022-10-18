package abstractClasses;

public class Main {
	public static void main(String[] args) {
		
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		//GameCalculator gameCalculator = new GameCalculator() { // abstract sınuflar asla new'lenemez.
			
		GameCalculator gameCalculator = new WomanGameCalculator();
		
		
	}

}
