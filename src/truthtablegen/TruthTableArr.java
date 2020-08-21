package truthtablegen;

/**
 *
 * @author fotso
 */
public class TruthTableArr {

    boolean arr[][];
    boolean b = false;
   
    Integer numVariables = 2;
    Integer rows = (int) Math.pow(2, numVariables);
    char[][] truthTable;

    boolean[][] printtt(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (Math.pow(2, n)); j++) {

                if (j < Math.pow(2, n - 1)) {
                    arr[j][i] = b;
                } else {
                    arr[j][i] = !b;
                }
            }
        }
        return (arr);
    }

  

    public TruthTableArr(char[][] truthTable) {
        this.truthTable = truthTable;
    }

    public TruthTableArr(char[][] truthTable,Integer row,Integer column) {
        this.truthTable = truthTable;
        this.numVariables = column;
        this.rows = row;
        
    }
    
    

    public TruthTableArr() {
    }

    void buildTT() {
        int column = 0;
        while (column < numVariables) {
            boolean state = false;
            short toggle = (short) Math.pow(2, numVariables - column - 1);

            int row = 1;
            while (row <= rows) {
                if ((row - 1) % toggle == 0) {
                    state = !state;
                }

                if (state) {
                    truthTable[row][column] = 'F';
                } else {
                    truthTable[row][column] = 'T';
                }

                row++;
            }

            column++;
        }

    }
    
     void affiche() {
        for (char[] l : truthTable) {
            System.out.println();
            for (char c : l) {
                System.out.print(" " + c + " ");
            }
        }
    }

}
