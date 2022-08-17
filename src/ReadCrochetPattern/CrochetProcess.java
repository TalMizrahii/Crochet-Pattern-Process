package ReadCrochetPattern;


import ProcessRelated.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * this class managing all the processes related to the crochet pattern.
 */
public class CrochetProcess extends ReadLines {
    private final PatternInfo patternInfo; //the patternInfo we will store the data in.
    private List<Calculation> calculations = new ArrayList<>(); // the calculation's observers list.

    /**
     * a constructor for the class.
     *
     * @param crochetPath the path to the crochet pattern's file.
     */
    public CrochetProcess(String crochetPath) {
        super(crochetPath);
        patternInfo = new PatternInfo();
    }

    /**
     * the run method starts the process of the program.
     */
    public void run() {
        menu();
        super.read();
        createCalculations(super.getEyesSum());

        for (int i = 0; i < getCalculations().size(); i++) {
            getCalculations().get(i).calculate();
            getCalculations().get(i).display();
        }

    }

    /**
     * creating the calculation we wish to preform on this pattern.
     *
     * @param numberOfEyes the number of eyes is set to the patternInfo.
     */
    public void createCalculations(int numberOfEyes) {
        patternInfo.setNumEyes(numberOfEyes);

        YarnProcess yarnProcess = new YarnProcess(patternInfo);
        getCalculations().add(yarnProcess);
        TimeProcess timeProcess = new TimeProcess(patternInfo);
        getCalculations().add(timeProcess);
        PriceProcess priceProcess = new PriceProcess(patternInfo);
        getCalculations().add(priceProcess);
    }

    /**
     * the menu of the program. Here the user will enter some information about the project and also his pace of work.
     */
    public void menu() {
        System.out.println("\nWelcome to the Crochet Pattern processor!\n"
                + "\nPlease type in the size of the hook you will use on your work in mm "
                + "(for example, if you will use 3 mm hook just type 3): ");
        Scanner scanner = new Scanner(System.in);
        patternInfo.setHookSize(scanner.nextInt());
        System.out.println("Excellent! Now please enter the number of parts you will make in this project: ");
        patternInfo.setNumberOfParts(scanner.nextInt());
        System.out.println("Great! just one more thing. To calculate the time this project will take, I need to know how"
                + " fast do you think you work:\nfor FAST press 1.\nfor MEDIUM press 2.\nfor SLOW press 3.");
        patternInfo.setUserSpeed(scanner.nextInt());
    }

    /**
     * a getter for the observers list of the calculation.
     *
     * @return the calculation's list of observers.
     */
    public List<Calculation> getCalculations() {
        return calculations;
    }

}