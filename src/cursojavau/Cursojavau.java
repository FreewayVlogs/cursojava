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
                    + "2. Empleados \n"
                    + "4. Salir\n");
            switch (entrada) {
                case "1":
                    Operador ejercicios = new Operador();
                    ejercicios.MostrarOpciones();
                    ejercicios.menu();
                    break;
                case "2":
                    int numero;
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba empleados a ingresar: "));
                    if (numero > 0) {
                        JOptionPane.showMessageDialog(null, "Base creada para "+numero+ " empleados");  
                    } else {
                        do {
                            numero = Integer.parseInt(JOptionPane.showInputDialog("el numero de emplados deber ser mayor a cero: "));
                        } while (numero <= 0);
                    
                        JOptionPane.showMessageDialog(null, "Base creada para "+numero+ " empleados");                      
                    }
                    ManejoEmpleados listaEmp[] = new ManejoEmpleados[numero];
                    ManejoEmpleados obj = new ManejoEmpleados();
                    for (int i = 0; i < listaEmp.length; i++) {
                       
                        listaEmp[i] = new ManejoEmpleados(JOptionPane.showInputDialog("Digite nombre: "),obj.ValidarEdad(),JOptionPane.showInputDialog("Digite Suledo: "));
                    }
                    
                     for (int i = 0; i < listaEmp.length; i++) {  
                        JOptionPane.showMessageDialog(null,"Empleado: "+ listaEmp[i]);    
                    }
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
