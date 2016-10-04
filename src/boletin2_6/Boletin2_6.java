
package boletin2_6;

import javax.swing.JOptionPane;


public class Boletin2_6 {

    
    public static void main(String[] args) {
        float prezoTarifa, prezoPagado, porcentaxeDescontada;
        prezoTarifa= Float.parseFloat(JOptionPane.showInputDialog("prezoTarifa"));
        prezoPagado= Float.parseFloat(JOptionPane.showInputDialog("prezoPagado"));
        porcentaxeDescontada=100*(prezoTarifa-prezoPagado)/prezoTarifa;
        JOptionPane.showMessageDialog(null,"A porcentaxe descontada=" +porcentaxeDescontada);
    }
    
}
