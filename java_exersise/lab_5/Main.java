/**
 * @author Burcev Yuri
 * @version 1.0
 */

package Yuri.Burcev.Task_5;

/** исполняемый класс Main*/
public class Main {
    /**
     *
     * @param args command line values
     */
    public static void main(String[] args) {
        /**
         * Создание объекта yellowNuclearsubmarine типа Nuclearsubmarine
         * @see Nuclearsubmarine
         */
        Nuclearsubmarine yellowNuclearsubmarine = new Nuclearsubmarine();
        /** вызов метода sendinswimming
         * @see Nuclearsubmarine #sendinswimming() */
        yellowNuclearsubmarine.sendinswimming();
    }
}
