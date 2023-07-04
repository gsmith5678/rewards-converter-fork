import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashVal = 100;
        int expectedMiles = (int) (cashVal/RewardValue.EXCHANGE_RATE);
        var actualMiles = new RewardValue(cashVal);
        assertEquals(expectedMiles, actualMiles.getMilesValue());


    }

    @Test
    void convert_from_miles_to_cash() {
        int milesVal = 10000;
        double expectedCash = milesVal * RewardValue.EXCHANGE_RATE;
        var actualCash = new RewardValue(milesVal);
        assertEquals(expectedCash, actualCash.getCashValue());
    }
}
