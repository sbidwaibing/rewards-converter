// Implementation of RewardValue class in java to update the missing function
// This class must satisfy the following requirements:
// RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
// RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
// RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
// RewardValue must convert from miles to cash at a rate of 0.0035.

public class RewardValue 
{
    private final double cashValue;   
    public static double milesToCashRate = 0.0035;

    public RewardValue(double cashValue)
    {
        this.cashValue = cashValue;
    }

    private static int convertToMiles(double cashValue) 
    {
        return (int)(cashValue / milesToCashRate);
    }

    public RewardValue(int milesValue)
    {
        this.cashValue = convertToCash(milesValue);
    }

    private static double convertToCash(int milesValue) 
    {
        return milesValue * milesToCashRate;
    }

    public double getCashValue()
    {
        return cashValue;
    }

    public int getMilesValue()
    {
        return convertToMiles(this.cashValue);
    }
}
