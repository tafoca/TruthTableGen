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
        int n = 4;

        long startTime = System.currentTimeMillis();
        TruthTable.printTruthTable(n);
        double duree = (System.currentTimeMillis() - startTime);

        System.out.println("Methode 1 ");
        System.out.println("\n : " + duree);

        //methode 2
        Scanner sc = new Scanner(System.in);

       // TruthTableArr ob = new TruthTableArr();
        System.out.println("Nombre de variable booleen");
        int num = sc.nextInt();
        int pownum = (int) Math.pow(2, num);
//        boolean array[][] = new boolean[pownum][num];
//        ob.arr = array;
//        array = ob.printtt(num);
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < (Math.pow(2, num)); j++) {
//
//                System.out.println(array[j][i]);
//            }
//        }
        char arr[][] = new char[pownum+1][num];
        TruthTableArr ob2 = new TruthTableArr(arr,pownum,num);
        ob2.buildTT();
        ob2.affiche();
        

    }

}
