package ProcessRelated;

/**
 * this class purpose is to store all data related to the pattern and make this data accessible.
 */
public class PatternInfo {
    // data related to the calculations which comes from the user.
    private double hookSize;
    private int numberOfParts;
    private int userSpeed;

    //information who comes from the reading process.
    private int numEyes = 0;

    //information which comes from the calculation process.
    private double timeOfWork = 0; //in seconds.
    private double price = 0; // in dollars.
    private double yarnLength = 0; //in centimeters.


    /**
     * a default constructor.
     */
    public PatternInfo() {
    }

    /**
     * a getter for the timeOfWork member.
     *
     * @return the reference to the timeOfWork.
     */
    public double getTimeOfWork() {
        return timeOfWork;
    }

    /**
     * a setter for the timeOfWork member.
     *
     * @param timeOfWork the new value of timeOfWork.
     */
    public void setTimeOfWork(double timeOfWork) {
        this.timeOfWork = timeOfWork;
    }

    /**
     * a getter for the price member.
     *
     * @return the reference to the price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * a setter for the price member.
     *
     * @param price the new value of price.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * a getter for the yarnLength member.
     *
     * @return the reference to the yarnLength.
     */
    public double getYarnLength() {
        return yarnLength;
    }

    /**
     * a setter for the yarnLength member.
     *
     * @param yarnLength the new value of yarnLength.
     */
    public void setYarnLength(double yarnLength) {
        this.yarnLength = yarnLength;
    }

    /**
     * a getter for the hookSize member.
     *
     * @return the reference to the hookSize.
     */
    public double getHookSize() {
        return hookSize;
    }

    /**
     * a setter for the hookSize member.
     *
     * @param hookSize the new value of hookSize.
     */
    public void setHookSize(double hookSize) {
        this.hookSize = hookSize;
    }

    /**
     * a getter for the numberOfParts member.
     *
     * @return the reference to the numberOfParts.
     */
    public int getNumberOfParts() {
        return numberOfParts;
    }

    /**
     * a setter for the numberOfParts member.
     *
     * @param numberOfParts the new value of numberOfParts.
     */
    public void setNumberOfParts(int numberOfParts) {
        this.numberOfParts = numberOfParts;
    }

    /**
     * a getter for the userSpeed member.
     *
     * @return the reference to the userSpeed.
     */
    public int getUserSpeed() {
        return userSpeed;
    }

    /**
     * a setter for the userSpeed member.
     *
     * @param userSpeed the new value of userSpeed.
     */
    public void setUserSpeed(int userSpeed) {
        this.userSpeed = userSpeed;
    }

    /**
     * a getter for the numEyes member.
     *
     * @return the reference to the numEyes.
     */
    public int getNumEyes() {
        return numEyes;
    }

    /**
     * a setter for the numEyes member.
     *
     * @param numEyes the new value of numEyes.
     */
    public void setNumEyes(int numEyes) {
        this.numEyes = numEyes;
    }
}
