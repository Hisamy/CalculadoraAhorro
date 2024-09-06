
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        System.out.println("-------- Calculadora de ahorros --------");
        System.out.println("Porcentaje de la tasa de interés mensual:  ");
        Float porcentajeInteres = tec.nextFloat();
        System.out.println("Cantidad de meses que tendrá el dinero ahorrado:  ");
        Integer meses = tec.nextInt();

        ArrayList<Float> aportes = new ArrayList();
        
        for (Integer i = 1; i <= meses; i++) {
            System.out.println("Aporte mes " + i + ":");
            Float aporte = tec.nextFloat();
            aportes.add(aporte);
        }

        Calculadora calculadora = new Calculadora();
        calculadora.mostrarTabla(aportes, porcentajeInteres);
    }

}
