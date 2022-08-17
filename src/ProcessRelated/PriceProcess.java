package ProcessRelated;

/**
 * This class generates calculation about the estimated price of the project.
 * The data is kept in the patternInfo member.
 */
public class PriceProcess implements Calculation {
    private PatternInfo patternInfo; // the patternInfo that the calculation's results will be kept in.
    //constants for the pricing calculation.
    private static final double PRICE_PER_EYE = 0.2;
    private static final double PRICE_PER_MIN = 0.1;

    /**
     * a constructor for the class, receiving only the patternInfo.
     *
     * @param patternInfo the patternInfo that the calculations results will be kept in.
     */
    public PriceProcess(PatternInfo patternInfo) {
        this.patternInfo = patternInfo;
    }

    /**
     * The calculation is based on 2 factors:
     * the amount of yarn the project requires and the duration of preparation.
     */
    @Override
    public void calculate() {
        double price = ((patternInfo.getYarnLength() * PRICE_PER_EYE / 100)
                + (patternInfo.getTimeOfWork() * PRICE_PER_MIN) / 3);
        patternInfo.setPrice(price);
    }

    /**
     * presenting the estimated price of the project.
     */
    @Override
    public void display() {
        System.out.printf("\nThe approximate price for this project is %.2f dollars\n", patternInfo.getPrice());
    }
}
