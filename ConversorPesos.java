
package programadeconversion;

/**
 *
 * @author Lenovo
 */
public class ConversorPesos {
    protected final double cambio;
    
    public ConversorPesos(double factorCambio){
        cambio = factorCambio;
    }
    
    public double convertirAmoneda(double cantidadMonedas) {
        return cantidadMonedas/cambio;
    }
    
    public double convertirApesos(double cantidadMonedas){
        return cantidadMonedas*cambio;
    }
}
