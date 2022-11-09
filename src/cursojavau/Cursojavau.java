/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursojavau;

import javax.swing.JOptionPane;
import clases.*;

/**
 *
 * @author mauriciounca
 */
public class Cursojavau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String entrada = "0";
        do {
            entrada = JOptionPane.showInputDialog(
                    "Seleccione una opción\n\n"
                    + "1. Menú de ejercicios paquete 1\n"
                    + "2. Menú de ejercicios paquete 2\n"
                    + "3. Menú de ejercicios paquete 3\n"
                    + "4. Salir\n");
            switch (entrada) {
                case "1":
                    Ejercicios ejercicios = new Ejercicios();
                    ejercicios.MostrarOpciones();
                    ejercicios.menu();
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Menú inicial cerrado");
                    entrada = "0";
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalidad");
                    break;
            }
        } while (entrada != "0");

    }

}
