package currency;

import java.util.Arrays;
import java.util.Iterator;

public class NoteCount {

	public void counting(int[] currency, int amount) {
		int notes[]=new int [currency.length];
		int sumOfNotes=0;
		for (int i = 0; i < currency.length; i++) {
			notes[i]=amount/currency[i];
			sumOfNotes=sumOfNotes+notes[i];
			amount=amount%currency[i];
		}
    System.out.println("Your payment approach in order to give min no of notes will be");
		for (int i = 0; i < currency.length; i++) {

	System.out.println( currency[i] + ":"+notes[i]);
			
		}
			
		}
	}


