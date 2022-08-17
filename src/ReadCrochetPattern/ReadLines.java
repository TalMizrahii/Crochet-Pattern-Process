package ReadCrochetPattern;

import SyntexRelated.Regexes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * this class reads the crochet pattern from the path sent to it, extracts the instruction lines and sums the number
 * of eyes needed to be knit for the crochet project.
 */
public abstract class ReadLines {
    private String crochetPath;                //the path to the crochet pattern.
    private int eyesSum = 0;                   //the sum of the eyes (set to 0 as default).
    private final Regexes reg = new Regexes(); //creating a new regex related class.

    /**
     * a constructor who receives the path to the crochet pattern.
     *
     * @param crochetPath the path to the crochet pattern.
     */
    public ReadLines(String crochetPath) {
        setCrochetPath(crochetPath);
    }

    /**
     * a getter for the sum of the eyes.
     *
     * @return the number of eyes caught so far.
     */
    public int getEyesSum() {
        return this.eyesSum;
    }

    /**
     * a setter for the sum of the eyes.
     *
     * @param eyesSum the new number of eyes caught so far.
     */
    public void setEyesSum(int eyesSum) {
        this.eyesSum = eyesSum;
    }

    /**
     * a getter for the path to the crochet pattern.
     *
     * @return the path to the pattern as a string.
     */
    public String getCrochetPath() {
        return crochetPath;
    }

    /**
     * a setter for the path to the crochet pattern.
     *
     * @param crochetPath the path to the pattern as a string.
     */
    public void setCrochetPath(String crochetPath) {
        this.crochetPath = crochetPath;
    }

    /**
     * read the pattern and sum the numbers of the eyes using regexes to find the numbers of eyes in each line.
     */
    public void read() {
        File file = new File(getCrochetPath());        //create the path to the crochet pattern's file.
        Pattern patternLine = this.reg.getLineCatch(); // get the line's regex.

        //try with resources for the bufferReader.
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = null; //needed as a control line for the buffer reader.

            // go over the lines and find the relevant line.
            while ((line = br.readLine()) != null) {
                Matcher matchLine = patternLine.matcher(line);
                if (matchLine.find()) { // if the instruction line was found, send it to be processed.
                    countEyes(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * if the regex caught instruction line, the line is sent here to extract the number of eyes to knit.
     *
     * @param line the line of instruction.
     */
    public void countEyes(String line) {
        Pattern patternEyes = this.reg.getEyesCatch(); // get the eye regex (for the count of eyes).
        Matcher matchLine = patternEyes.matcher(line); //create the matcher for the eyes number.

        // if the eyes number is found, add it to the sum.
        if (matchLine.find()) {
            setEyesSum(getEyesSum() + Integer.parseInt(matchLine.group(1)));
        }
    }
}
