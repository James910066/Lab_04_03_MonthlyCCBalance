public class MonthlyCCBalance
{
    public static void main(String[] args)
    {
        int cardBalance = 5000;
        double INTEREST_RATE = .17;
        double oneMonthInterest;
        double twoMonthInterest;
        oneMonthInterest = cardBalance * INTEREST_RATE;
        twoMonthInterest = oneMonthInterest + cardBalance * INTEREST_RATE;
        System.out.println("The interest for 1 month is $" + oneMonthInterest);
        System.out.println("The interest for 2 months is $" + twoMonthInterest);
    }

}
