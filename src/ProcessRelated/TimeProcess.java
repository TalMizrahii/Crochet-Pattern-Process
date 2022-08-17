package ProcessRelated;

/**
 * This class generates calculation about the estimated time this project will take to make.
 * The data is kept in the patternInfo member.
 */
public class TimeProcess implements Calculation {
    private PatternInfo patternInfo;
    //constants for the time calculation. all in seconds
    private static final double TIME_PER_EYE = 2;
    private static final double TIME_PER_PART = 1000;
    private static final double PROCRASTINATION = 2000;

    /**
     * a constructor for the class, receiving only the patternInfo.
     *
     * @param patternInfo the patternInfo that the calculations results will be kept in.
     */
    public TimeProcess(PatternInfo patternInfo) {
        this.patternInfo = patternInfo;
    }

    /**
     * The calculation is based on 3 factors:
     * the eyes number, the number of parts and Procrastination time.
     */
    @Override
    public void calculate() {
        double timeOfWork = (patternInfo.getNumEyes() * TIME_PER_EYE)
                + (patternInfo.getNumberOfParts() * TIME_PER_PART)
                + (PROCRASTINATION * patternInfo.getUserSpeed());

        patternInfo.setTimeOfWork(timeOfWork / 60);
    }

    /**
     * presenting the estimated price this project will take.
     */
    @Override
    public void display() {
        System.out.printf("\nThe approximate time this project requires is %.2f minutes, which are %.2f hours.\n",
                patternInfo.getTimeOfWork(), (patternInfo.getTimeOfWork() / 60));
    }
}