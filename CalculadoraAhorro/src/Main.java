
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Float porcentajeInteres = -1f;
        Integer meses = -1;
        Float aporte = -1f;

        Scanner tec = new Scanner(System.in);
        System.out.println("-------- Calculadora de ahorros --------");

        //Un ciclo, mientras porcentaje de interés sea -1, se va a seguir preguntando el porcentaje 
        //hasta que se ingrese una cifra válida, mayor de 0 y que sea Float
        do {
            try {
                System.out.println("Porcentaje de la tasa de interés mensual:  ");
                porcentajeInteres = tec.nextFloat();
                if (porcentajeInteres < 0) {
                    System.out.println("El porcentaje de interés no puede menor que 0");
                    porcentajeInteres = -1f;
                }
            } catch (InputMismatchException e) {
                System.out.println("Favor de ingrese una cifra válida");
                tec.next();
            }
        } while (porcentajeInteres < 0);

        //Un ciclo, mientras el mes sea -1, se va a seguir pidiendo la cantidad 
        //de meses hasta que se ingrese una cifra válida, mayor de 0 y que sea Integer
        do {
            try {

                System.out.println("Cantidad de meses que tendrá el dinero ahorrado:  ");
                meses = tec.nextInt();
                if (meses < 0) {
                    System.out.println("No puede ingresar meses menores a 0");
                    meses = -1;
                }

            } catch (InputMismatchException e) {
                System.out.println("Favor de ingrese un mes válido");
                tec.next();

            }
        } while (meses < 0);

        ArrayList<Float> aportes = new ArrayList();

        //For que repite el ciclo hasta que se acaben los meses
        for (Integer i = 1; i <= meses; i++) {
            //Un ciclo, mientras el aporte sea -1, se va a seguir pidiendo el aporte
            //hasta que se ingrese una cifra válida, mayor de 0 y que sea Float
            do {
                try {

                    System.out.println("Aporte mes " + i + ":");
                    aporte = tec.nextFloat();
                    if (aporte < 0) {
                        System.out.println("No puede ingresar aportes menores a 0");
                        meses = null;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Favor de ingrese una cifra válida");
                    tec.next();
                }
            } while (aporte < 0);
            aportes.add(aporte);
            
        }

        Calculadora calculadora = new Calculadora();
        calculadora.mostrarTabla(aportes, porcentajeInteres);
    }

}
