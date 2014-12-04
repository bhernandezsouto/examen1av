/* Commit Inicial. */
/* Revert */
/* Commit Final */
package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iN = 11;
        if (metodoMio(iN)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }

        for (int x = 22; x < 1000; x++) {
            if (metodoMio(x)) {
                System.out.print(x + " ");
            }
        }
    }
// la respuesta del primer apartado es false
// no llega a j=21 cuando variable=22 ya que al ser divisible entre dos aux es false y sale, aunque siendo el 
// caso aux deveria ser true y true. realizado haciendo debug no llega nunca a estos valores pero modificando
// el valor de variable y j se optiene esa respuesta.
    public static boolean metodoMio(int variable) {
        int j = 21;
        boolean aux = true;
        while ((aux) && (j != variable)) {
            if (variable % j == 0) {
                aux = false;
            }
            j++;
        }
        return aux;
    }

}
