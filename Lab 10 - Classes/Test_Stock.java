class Test_Stock {
	public static void main(String[] args) {
		// instantiates two objects for Google and Microsoft
		Stock Google = new Stock("GOOG", "Google", 134.67, 131.98);
		Stock Microsoft = new Stock("MSFT", "Microsoft", 156.52, 161.22);
		
		// prints values from Google stock object
		System.out.printf("Google Stock:\n");
		System.out.printf("Symbol: %s\n", Google.getSymbol());
		System.out.printf("Closing Price: %g\n", Google.previousClosingPrice);
		System.out.printf("Current Price: %g\n", Google.currentPrice);
		System.out.printf("Change Percent: %g", Google.changePercent());
		System.out.println("%");
		System.out.println(Google);
		
		System.out.println();
		
		// prints values from Microsoft stock object
		System.out.printf("Microsoft Stock:\n");
		System.out.printf("Symbol: %s\n", Microsoft.getSymbol());
		System.out.printf("Closing Price: %g\n", Microsoft.previousClosingPrice);
		System.out.printf("Current Price: %g\n", Microsoft.currentPrice);
		System.out.printf("Change Percent: %g", Microsoft.changePercent());
		System.out.println("%");
		System.out.println(Microsoft);

	}
}