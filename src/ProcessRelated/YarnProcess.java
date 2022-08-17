package ProcessRelated;

/**
 * This class generates calculation about the estimated amount of yarn this project will consume.
 * The data is kept in the patternInfo member.
 */
public class YarnProcess implements Calculation {
    private PatternInfo patternInfo;
    //constants for the yarn length calculation.
    private static final double HOOK_TO_EYES = 5;
    private static final double PARTS_TO_SEWING = 100;
    private static final double WASTE = 350;

    /**
     * a constructor for the class, receiving only the patternInfo.
     *
     * @param patternInfo the patternInfo that the calculations results will be kept in.
     */
    public YarnProcess(PatternInfo patternInfo) {
        this.patternInfo = patternInfo;
    }

    /**
     * the calculation is based on 4 factors:
     * the number of eyes, the amount of parts to knit, the hook size and the constant waste of yarn.
     * the result is displayed in centimeters.
     **/
    @Override
    public void calculate() {
        double yarnLength = ((patternInfo.getHookSize() * HOOK_TO_EYES) * patternInfo.getNumEyes()) // eyes size
                + (patternInfo.getNumberOfParts() * PARTS_TO_SEWING) // parts to sew
                + WASTE; // waste
        patternInfo.setYarnLength(yarnLength);
    }

    /**
     * presenting the estimated amount of yarn this project will consume.
     */
    @Override
    public void display() {
        System.out.printf("\nThe approximate amount of yarn this pattern requires is %.2f"
                        + " centimeters, which are %.2f meters\n", patternInfo.getYarnLength(),
                (patternInfo.getYarnLength() / 100));
    }
}