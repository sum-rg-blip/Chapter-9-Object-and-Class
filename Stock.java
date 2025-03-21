package Chapter9ObjectsAndClasses;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    public Stock(String symbol,String name){
        this.symbol=symbol;
        this.name=name;

    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

}
