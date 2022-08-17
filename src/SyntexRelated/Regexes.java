package SyntexRelated;

import java.util.regex.Pattern;

/**
 * a class to manage all regexes related to the finding and processing the crochet pattern.
 */
public class Regexes {

    //the regexes as members.
    private static final String LINE_CATCH = "^([rR](nd|ound))|\\d+[\\)\\]\\.]|^[rR]";
    private static final String EYES_CATCH = "[\\[|\\(](\\d+)[\\]|\\)]";

    /**
     * a default constructor for the class.
     */
    public Regexes() {
    }

    /**
     * a getter for the regex which catches the eyes in the crochet pattern.
     *
     * @return the regex as a string.
     */
    public Pattern getEyesCatch() {
        return Pattern.compile(EYES_CATCH, Pattern.CASE_INSENSITIVE
                | Pattern.MULTILINE);
    }

    /**
     * a getter for the regex which catches the instruction line in the crochet pattern.
     *
     * @return the pattern as a string.
     */
    public Pattern getLineCatch() {
        return Pattern.compile(LINE_CATCH, Pattern.CASE_INSENSITIVE
                | Pattern.MULTILINE);
    }
}