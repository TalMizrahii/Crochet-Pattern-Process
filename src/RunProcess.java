import ReadCrochetPattern.CrochetProcess;


/**
 * the run class of the system. receives the path to the crochet pattern via args[].
 * @author Tal Mizrahi, Taltalon1927@gmail.com
 * @since 15/08/2022
 */
public class RunProcess {

    /**
     * @param args receives two arguments, a file directory of the pattern and to the result of the process file.
     */
    public static void main(String[] args) {
        String crochet = args[0] + " " + args[1];
        CrochetProcess crochetProcess = new CrochetProcess(crochet);
        crochetProcess.run();
    }
}