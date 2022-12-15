import java.util.Scanner;
public class SynthesizerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		Synthesizer synthesizer1 = new Synthesizer("Yamaha", "DX7", 61);
		synthesizer1.printData();
		synthesizer1.start();
		
		Synthesizer synthesizer2 = new Synthesizer("Juno", "X", 61);
		synthesizer2.printData();
		synthesizer2.playNotes();

		Synthesizer synthesizer3 = new Synthesizer("Korg", "Microkorg", 37);
		synthesizer3.printData();
		synthesizer3.shutDown();


	
	}

} // Main loppuu

class Synthesizer
{
	String brand;
	String model;
	int keyboard;
	

	// muodostin
	public Synthesizer(String brandName, String modelName, int keyboardCount) {
		
		brand = brandName;
		model = modelName;
		keyboard = keyboardCount;	
	}
		
	

	//tulosta tiedot
	public void printData() {
		
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Keyboard: " + keyboard);
	}
		
	
	// käynnistä syntetisaattori
		public void start(){
			
			System.out.println("Synthesizer on");
		}
		
	// soita säveliä 
		public void playNotes() {
		
		System.out.println("Notes played");
		}

		// sammuta 
		public void shutDown()
		{
		System.out.println("Shutting down");
		}
	
		
		
}

