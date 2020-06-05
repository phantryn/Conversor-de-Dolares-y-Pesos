/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programadeconversion;

/**
 *
 * @author Lenovo
 */
public class ProgramaDeConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // el modelo:
        ConversorPesosADolares modelo = new ConversorPesosADolares();
        // la vista:
        InterfazVista vista = new VentanaConversor();
        // y el control:
        ControlConversor control = new ControlConversor (vista,
        modelo);
        // configura la vista
        vista.setControlador(control);
        // y arranca la interfaz (vista):
        vista.arranca();
    }
    
}
