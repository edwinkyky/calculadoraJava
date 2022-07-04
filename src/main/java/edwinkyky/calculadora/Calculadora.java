/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edwinkyky.calculadora;

/**
 *
 * @author kygon
 */
import java.awt.HeadlessException;
import javax.swing.JOptionPane;




/**
 *
 * @author kygon
 */
public class Calculadora {

    public static void main(String[] args) {
        try {
            int menuPrincipal;
            do {
                String menu;

                menu = JOptionPane.showInputDialog("Selecciones una operación"
                        + "\n1. Ingresar a la calculadora"
                        + "\n2. Salir");

                menuPrincipal = Integer.parseInt(menu);

                if (menuPrincipal == 1) {
                    clsOperaciones operaciones = new clsOperaciones(menuPrincipal);
                } else if (menuPrincipal == 2) {

                    JOptionPane.showMessageDialog(null, "Gracias");

                }
            } while (menuPrincipal != 2);
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Opción no válida, sólo 1 y 2");
            
        }
    }

}
