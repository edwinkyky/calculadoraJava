/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edwinkyky.calculadora;

/**
 *
 * @author kygon
 */
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author kygon
 */
public class clsOperaciones extends Calculadora {

    clsOperaciones(int menuPrincipal) {
        String Opciones;
        double Suma;
        double Resta;
        double Division;
        double Multiplicacion;
        double Potencia;
        double Raiz;
        int opt;
        try {
            do {

                Opciones = JOptionPane.showInputDialog("Seleccione una operación: "
                        + "\n1. Suma"
                        + "\n2. Resta"
                        + "\n3. Multiplicación"
                        + "\n4. División"
                        + "\n5. Potencia"
                        + "\n6. Raiz"
                        + "\n7. Salir");

                opt = Integer.parseInt(Opciones);

                switch (opt) {

                    case 1 -> {
                        DecimalFormat df = new DecimalFormat("#.00");
                        String sumar1, sumar2;
                        sumar1 = JOptionPane.showInputDialog("Ingrese un valor: ");
                        sumar2 = JOptionPane.showInputDialog("Ingrese un valor: ");
                        double numero1 = Double.parseDouble(sumar1);
                        double numero2 = Double.parseDouble(sumar2);
                        Suma = numero1 + numero2;
                        JOptionPane.showMessageDialog(null, Suma);
                    } // Fin del SI suma
                    case 2 -> {
                        DecimalFormat df = new DecimalFormat("#.00");
                        String restar1, restar2;
                        restar1 = JOptionPane.showInputDialog("Ingrese un valor: ");
                        restar2 = JOptionPane.showInputDialog("Ingrese un valor: ");
                        double numero1 = Double.parseDouble(restar1);
                        double numero2 = Double.parseDouble(restar2);
                        Resta = numero1 - numero2;
                        JOptionPane.showMessageDialog(null, df.format(Resta));
                    }//Fin del SI resta
                    case 3 -> {
                        DecimalFormat df = new DecimalFormat("#.00");
                        String multiplicar1, multiplicar2;
                        multiplicar1 = JOptionPane.showInputDialog("Ingrese un valor: ");
                        multiplicar2 = JOptionPane.showInputDialog("Ingrese un valor: ");
                        double numero1 = Double.parseDouble(multiplicar1);
                        double numero2 = Double.parseDouble(multiplicar2);
                        Multiplicacion = numero1 * numero2;
                        JOptionPane.showMessageDialog(null, df.format(Multiplicacion));
                    }//Fin del SI multiplicación
                    case 4 -> {
                        DecimalFormat df = new DecimalFormat("#.00");
                        String dividir1, dividir2;
                        dividir1 = JOptionPane.showInputDialog("Ingrese un valor: ");
                        dividir2 = JOptionPane.showInputDialog("Ingrese un valor: ");
                        double numero1 = Double.parseDouble(dividir1);
                        double numero2 = Double.parseDouble(dividir2);
                        if (numero2 == 0) {
                            JOptionPane.showMessageDialog(null, "Ma. Error, No div. entre 0");
                            break;
                        } else {
                            Division = numero1 / numero2;
                            JOptionPane.showMessageDialog(null, df.format(Division));
                        }
                    }//Fin del SI división
                    case 5 -> {
                        DecimalFormat df = new DecimalFormat("#.00");
                        String potencia1, potencia2;
                        potencia1 = JOptionPane.showInputDialog("Ingrese un valor: ");
                        potencia2 = JOptionPane.showInputDialog("Ingrese un valor: ");
                        double numero1 = Double.parseDouble(potencia1);
                        double numero2 = Double.parseDouble(potencia2);
                        Potencia = Math.pow(numero1, numero2);
                        JOptionPane.showMessageDialog(null, df.format(Potencia));
                    }//Fin del SI potencia
                    case 6 -> {
                        DecimalFormat df = new DecimalFormat("#.00");
                        String raiz1;
                        raiz1 = JOptionPane.showInputDialog("Ingrese un valor: ");
                        double numero1 = Double.parseDouble(raiz1);
                        Raiz = Math.sqrt(numero1);
                        JOptionPane.showMessageDialog(null, df.format(Raiz));
                    }//Fin del SI Raiz Cuadrada
                    case 7 -> {
                        break;
                    }//Opción Salir
                    default -> {
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                    }
                }

            } while (opt != 7);

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Opción no válida");

        }
    }
}
