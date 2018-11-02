// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 11

class Radio {
	int station = 1;
	int volume = 1;
	boolean on = false;
	
	public Radio(){
		this.station = station;
		this.volume = volume;
		this.on = true;
	}
	
	public int getStation(){
		return station;
	}
	
	public int getVolume(){
		return volume;
	}
	
	public void turnOn(){
		on = true;
	}
	
	public void turnOff(){
		on = false;
	}
	
	public void stationUp(){
		if(station >= 1 && station <10)
			station++;
		else if(station == 10)
			station = 1;	
	}
	
	public void stationDown(){
		if(station >1 && station <= 10)
			station--;
		else if(station == 1)
			station = 10;	
	}
	
	public void volumeUp(){
		if(on == true && volume >= 1 && volume < 10)
			volume++;
		else if(on == true && volume == 10)
			volume = 1;
		else if(on == false)
			System.out.println("Sorry, the radio isn't on!");			
	}
	
	public void volumeDown(){
		if(on == true && volume > 1 && volume <= 10)
			volume--;
		else if(on == true && volume == 1)
			volume = 10;
		else if(on == false)
			System.out.println("Sorry, the radio isn't on!");			
	}
	
	public String toString(){
		return "The radio station is "+station+" and the volume level is "+volume;
	}

	
}