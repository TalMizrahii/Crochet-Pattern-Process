package ProcessRelated;

/**
 * an interface of every calculation related to this project.
 * main purpose is to use as an observer to every calculation we will want the project to preform.
 */
public interface Calculation {
    /**
     * the calculation the specific object is making.
     */
    void calculate();

    /**
     * presenting the result of the calculation to the user.
     */
    void display();
}
