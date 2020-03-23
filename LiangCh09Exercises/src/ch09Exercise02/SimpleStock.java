package ch09Exercise02;

public class SimpleStock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;

	public SimpleStock() {
	}

	public SimpleStock(String creationSymbol, String creationName, double creationPreviousClosingPrice) {
		this.symbol = creationSymbol;
		this.name = creationName;
		this.previousClosingPrice = creationPreviousClosingPrice;
	}

	public double getClosingPrice() {
		return this.previousClosingPrice;
	}

	public double getCurrentPrice() {
		return this.currentPrice;
	}
	
	public String getName() {
		return this.name;
	}

	public double getPriceChangePercentage() {
		return (100 *((this.currentPrice - this.previousClosingPrice )/this.previousClosingPrice));
	}
	
	public String getSymbol() {
		return this.symbol;
	}
	
	public void setCurrentPrice(double updatedCurrentPrice) {
		this.currentPrice = updatedCurrentPrice;
	}
}
