class Stock {
	String Symbol;
	String Name;
	double previousClosingPrice;
	double currentPrice;
	
	public Stock(String Symbol, String Name, double previousClosingPrice, double currentPrice){
		this.Symbol = Symbol;
		this.Name = Name;
		this.previousClosingPrice = previousClosingPrice;
		this.currentPrice = currentPrice;
	}
	
	public String getName(){
		return Name;
	}
	
	public String getSymbol(){
		return Symbol;
	}
	
	public double setClosingPrice(){
		return currentPrice;
	}
	
	public double setCurrentPrice(){
		return currentPrice;
	}
	
	public double changePercent(){
		double percent = (currentPrice - previousClosingPrice)/currentPrice*100;
		return percent;
	}
	
	public String toString(){
		return (this.Name + " closing stock price is $" + this.currentPrice);
	}
}