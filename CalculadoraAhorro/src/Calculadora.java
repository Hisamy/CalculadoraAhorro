import java.util.ArrayList;

public class Calculadora {

    /**
     * Método que muestra la tabla de los cálculos.
     *
     * @param aportes lista de aportes mensuales.
     * @param porcentajeInteres porcentaje de la tasa de interés.
     */
    public void mostrarTabla(ArrayList<Float> aportes, Float porcentajeInteres) {
        System.out.printf("%-10s %-15s %-15s %-15s\n", "Mes", "Aporte", "Interés", "Total");

        int mes = 1;
        Float totalNeto = 0f;
        for (Float aporte : aportes) {

            Float interesCalculado = calcularCostoInteres(aporte, porcentajeInteres);
            Float totalCalculado = calcularTotalMes(aporte, interesCalculado);

            System.out.printf("%-10d $%-15.2f $%-15.2f $%-15.2f\n", mes, aporte, interesCalculado, totalCalculado);

            mes++;
            totalNeto += totalCalculado;

        }
        System.out.println("Total neto: $" + totalNeto);
    }

    /**
     * Calcula el costo del interes en base al aporte mensual.
     *
     * @param aporte aporte mensual.
     * @param porcentajeInteres porcentaje de la tasa de interés.
     * @return
     */
    private Float calcularCostoInteres(Float aporte, Float porcentajeInteres) {
        return aporte * (porcentajeInteres / 100);
    }

    /**
     * Calcula el costo total del mes. Sumando el costo del interes en base al
     * aporte mensual más el porcentaje de la tasa de interés.
     *
     * @param aporte aporte mensual.
     * @param costoInteres costo del interes en base al aporte mensual.
     * @return
     */
    private Float calcularTotalMes(Float aporte, Float costoInteres) {
        return costoInteres + aporte;
    }
}
