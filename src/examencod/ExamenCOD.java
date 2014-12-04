/* Commit Inicial. */
package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato = 11; //Dato el cual queremos saber si es o no primo
        if (esPrimo(dato)) { // Condicional que nos dice si el dato es primo o no.
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }

        for (int x = 2; x < 1000; x++) { // Bucle que se encarga de imprimir los numeros primos del 2 al 1000.
            if (esPrimo(x)) {
                System.out.print(x + " ");
            }
        }
    }

    public static boolean esPrimo(int variable) { //Este metodo se encarga de hacer las validaciones necesarias
                                                  //para saber si el número es primo o no se utiliza un auxiliar
                                                  //que se inicia en verdadero y en el bucle while se divide esta 
                                                  //variable por todos los numeros menores a ella empezando por el 
                                                  //si entra en el if el numero ya es divisible por algun otro y 
                                                  //por lo tanto ya no es primo, se cambia el aux a false y se retorna
        int j = 2;
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
