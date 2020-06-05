/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programadeconversion;

/**
 *
 * @author Angel
 */
public interface InterfazVista {
    void setControlador(ControlConversor c);
    void arranca(); // comienza la visualización
    double getCantidad(); // cantidad a convertir
    void escribeCambio(String s); //texto con la conversión
    // Constantes que definen las posibles operaciones:
    static final String APESOS="Pesetas a Pesos";
    static final String ADOLARES="Euros a Dolares";
}
