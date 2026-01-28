public class CurrencyConverter {
    
    private static final double VND_TO_USD_RATE = 0.0000038;
    private static final double EUR_TO_USD_RATE = 1.19; 
    private static final double VND_TO_EUR_RATE = 0.0000032;
    private static final double USD_TO_EUR_RATE = 0.84;

    private double amount;
    private String currencyCode;
    
    public CurrencyConverter() {
        this.amount = 0.0; 
        this.currencyCode = "USD";
    }

    public CurrencyConverter(double amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setAmount(double amount) {
        this.amount = amount; 
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode; 
    }

    public double toUSD() {
        switch(currencyCode) {
            case "VND":
                return amount * VND_TO_USD_RATE;
            case "EUR":
                return amount * EUR_TO_USD_RATE;
            default:
                return amount;
        }
    }

    public double toEUR() {
        switch(currencyCode) {
            case "USD":
                return amount * USD_TO_EUR_RATE;
            case "VND":
                return amount * VND_TO_EUR_RATE;
            default:
                return amount;
        }
    }

    public String toString() {
        return "Currency[amount=" + amount + ", currencyCode=" + currencyCode + "]";
    }
}