
package programadeconversion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lenovo
 */
public class ControlConversor implements ActionListener {
    
    private InterfazVista vista;
    private ConversorPesosADolares modelo;
    
    public ControlConversor(InterfazVista vista, ConversorPesosADolares modelo)
    {
        this.vista = vista;
        this.modelo = modelo;
    }
    
    public void actionPerformed(ActionEvent evento) {
        double cantidad = vista.getCantidad();
        if ( evento.getActionCommand().equals(InterfazVista.APESOS) ) {
            vista.escribeCambio( cantidad + " Dolares son: "
            + modelo.convertirApesos(cantidad) + " Pesos" );
        }
        else if ( evento.getActionCommand().equals(InterfazVista.ADOLARES)) {
            vista.escribeCambio( cantidad + " Pesos son: "
            + modelo.convertirAmoneda(cantidad) + " Dolares" );
        }
        else
            vista.escribeCambio( "ERROR" );
     }
}
