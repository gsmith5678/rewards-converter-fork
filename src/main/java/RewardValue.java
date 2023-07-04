public class RewardValue {

    private final double cashValue;
    private final int milesValue;
    private static final double EXCHANGE_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);
    }

    private int convertToMiles(double cashValue){
        return (int)(cashValue / EXCHANGE_RATE);
    }

    private double convertToCash(int milesValue){
        return milesValue * EXCHANGE_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}
