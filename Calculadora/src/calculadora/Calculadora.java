
package calculadora;

import java.util.Scanner;

/**
 *
 * @author hisam
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingresar=new Scanner(System.in);
     System.out.println("ingrese el primer numero");
     float numero1=ingresar.nextFloat();
     System.out.println("ingrese el segundo numero");
     float numero2=ingresar.nextFloat();
     float resultado=suma(numero1, numero2);
     float resultadoo=resta(numero1, numero2);
     System.out.println(resultado);
     System.out.println(resultadoo);
    }
    public static float suma (float numero1 , float numero2){
      return numero1+numero2;
    }
    public static float resta (float numero1, float numero2){
        return numero1-numero2;
        
    }
}
