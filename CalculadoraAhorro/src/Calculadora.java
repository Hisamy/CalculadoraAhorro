
import java.util.ArrayList;

public class Calculadora {

    public void mostrarTabla(ArrayList<Float> aportes, Float porcentajeInteres) {
        System.out.printf("%-10s %-15s %-15s %-15s\n", "Mes", "Aporte", "Interés", "Total");

        int mes = 1;
        Float totalNeto =  0f;
        for (Float aporte : aportes) {

            Float interesCalculado = calcularCostoInteres(aporte, porcentajeInteres);
            Float totalCalculado = calcularTotalMes(aporte, interesCalculado);

            System.out.printf("%-10d $%-15.2f $%-15.2f $%-15.2f\n", mes, aporte, interesCalculado, totalCalculado);
            
            mes++;
            totalNeto += totalCalculado;
             
        }
        System.out.println("Total neto: $"+totalNeto);
    }

    private Float calcularCostoInteres(Float aporte, Float porcentajeInteres) {
        return aporte * (porcentajeInteres / 100);
    }

    private Float calcularTotalMes(Float aporte, Float costoInteres) {
        return costoInteres + aporte;
    }
}
