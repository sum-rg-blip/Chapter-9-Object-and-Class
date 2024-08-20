package Chapter9ObjectsAndClasses;

public class TestStock {
    public static void main(String[] args) {
        Stock stock =new Stock("ORCL","Oracle Corporation");
        stock.setCurrentPrice(34.35);
        stock.setPreviousClosingPrice(34.5);
        System.out.println("display the price-change percentage : " +stock.getChangePercent());
    }
}
