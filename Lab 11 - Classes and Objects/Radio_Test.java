// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 11

class Radio_Test {
	public static void main(String[] args) {
		// instantiates a radio object
		Radio radio = new Radio();
		
		// tests for radio object
		
		// prints default toString method
		System.out.printf("Turn radio on:\n\t");
		System.out.println(radio);
		
		// sets volume up by 3
		for(int i=0;i<3;i++)
			radio.volumeUp();
		System.out.printf("Turn volume up by 3:\n\t");
		System.out.println(radio);
		
		// move station up by 5
		for(int i=0;i<5;i++)
			radio.stationUp();
		System.out.printf("Move station up by 5:\n\t");
		System.out.println(radio);
		
		// turn volume down by 1
		radio.volumeDown();
		System.out.printf("Turn volume down by 1:\n\t");
		System.out.println(radio);
		
		// move station up by 3
		for(int i=0;i<3;i++)
			radio.stationUp();
		System.out.printf("Move station up by 3:\n\t");
		System.out.println(radio);
		
		// turn radio off
		radio.turnOff();
		
		// turn volume up by 2
		for(int i=0;i<2;i++)
			radio.volumeUp();			
	
		// turn volume down by 2
		for(int i=0;i<2;i++)
			radio.volumeDown();
	}
}