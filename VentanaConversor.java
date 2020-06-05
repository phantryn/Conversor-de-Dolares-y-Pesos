/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programadeconversion;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class VentanaConversor  extends JFrame implements InterfazVista {
    private JButton convertirAdolares;
    private JButton convertirApesos;
    private JTextField cantidad;
    private JLabel resultado;
    
    public VentanaConversor () {
        super("Conversor de Dolares y Pesos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout(500,50));
        
        cantidad = new JTextField(8);
        JPanel panelaux = new JPanel(); panelaux.add(cantidad);
        panelPrincipal.add(panelaux, BorderLayout.NORTH);
        
        resultado = new JLabel("Indique la cantidad que desea convertir");
        JPanel panelaux2 = new JPanel(); panelaux2.add(resultado);
        panelPrincipal.add(panelaux2, BorderLayout.CENTER);
        
        convertirAdolares = new JButton("Dolares");
        convertirAdolares.setActionCommand(ADOLARES);
        convertirApesos = new JButton("Pesos");
        convertirApesos.setActionCommand(APESOS);
        JPanel botonera = new JPanel();
        botonera.add(convertirAdolares); botonera.add(convertirApesos);
        panelPrincipal.add(botonera, BorderLayout.SOUTH);
        getContentPane().add(panelPrincipal);
    }
    
    // Métodos de la interfaz InterfazVista:
    @Override
    public void escribeCambio(String s) {
        resultado.setText(s);
    }
    @Override
    public double getCantidad() {
        try {
            return Double.parseDouble(cantidad.getText());
        }
            catch (NumberFormatException e) {
            return 0.0D;
        }
    }
    
    @Override
    public void setControlador(ControlConversor c) {
        convertirAdolares.addActionListener(c);
        convertirApesos.addActionListener(c);
    }
    @Override
    public void arranca() {
        pack();// coloca los componentes
        setLocationRelativeTo(null);// centra la ventana en la pantalla
        setVisible(true);// visualiza la ventana
    }

}
