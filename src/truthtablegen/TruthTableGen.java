/**
 * Comapraison of ttg methode
 */
package truthtablegen;

import java.util.Scanner;

/**
 *
 * @author fotso
 */
public class TruthTableGen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 10;

        long startTime = System.currentTimeMillis();
        TruthTable.printTruthTable(n);
        double duree = (System.currentTimeMillis() - startTime);

        System.out.println("Methode 1 ");
        System.out.println("\n : " + duree);

        //methode 2
      //  Scanner sc = new Scanner(System.in);
        int num ;
        //int num = sc.nextInt();
        // TruthTableArr ob = new TruthTableArr();
        System.out.println("Nombre de variable booleen");
       
        //test
        num = n;
        int pownum = (int) Math.pow(2, num);
        char arr[][] = new char[pownum + 1][num];
        TruthTableArr ob2 = new TruthTableArr(arr, pownum, num);

        long startTime1 = System.currentTimeMillis();
        ob2.buildTT();
        ob2.affiche();
        double duree1 = (System.currentTimeMillis() - startTime1);

        System.out.println("Methode 2 ");
        System.out.println("\n : " + duree1);

    }

}
