package truthtablegen;

/**
 *
 * @author fotso
 */
public class TruthTable {
    /**
     * methode 1
     * @param n int value (Number of logical variable)
     */
    static void printTruthTable(int n) {
        int rows = (int) Math.pow(2, n);

        for (int i = 0; i < rows; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print((i / (int) Math.pow(2, j)) % 2 + " ");
            }
            System.out.println();
        }
    }
}
