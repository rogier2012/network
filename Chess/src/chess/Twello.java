package chess;

public class Twello {

	public static void main(String[] args) {
		Ron ron = new Ron();
		ron.makeSchaak();
		ron.watIsRon();
	}

	/*
	 * Uw uitlaatklep voor alle grappen, grollen, meligheden en gedoe. Klasse.
	 */

}

class Ron {

	private String antwoord = "aardbei";
	private boolean isRonDood;
	private String schaakspel = "schaakspel";
	private int counter = 0;
	public Ron() {

	}

	public String waaromTwello() {
		return antwoord;
	}
	
	public String makeSchaak() {
		return schaakspel;
	}
	

	// Tip van bob voor GUI: libgdx

	public void moveRon(int rageLvl){
		if (rageLvl > 10 ){
			isRonDood = true;
		} else {
			rageLvl++;
		}

	}
	public void watIsRon() {
		System.out.println("Wat ben je?");
		try {
			Thread.sleep(2234);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("een beunhaas");
		
		weetjeWatJijBent();
	}
	public void weetjeWatJijBent() {
		counter++;
		try {
			Thread.sleep(2234);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Beunhaaas beunhaas jij bent een beunhaasss.......");
		// Copyright RvB
		
		if (counter < 3) {
			weetjeWatJijBent();
		}

	}
}
