/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author mauriciounate
 */
public class ManejoEmpleados {

    private String nombre;
    private int edad;
    private float sueldo;

    public ManejoEmpleados(String nombre, int edad, String sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = Float.parseFloat(sueldo);
    }

    public ManejoEmpleados() {
    }
    
    

    public int ValidarEdad() {
        int ValEdad = Integer.parseInt(JOptionPane.showInputDialog("Digite edad: "));
        if (ValEdad > 18) {
            return ValEdad;
        } else {
            do {
                ValEdad = Integer.parseInt(JOptionPane.showInputDialog("Debe ser mayor a 18 años, digite de nuevo la edadz: "));
            } while (ValEdad < 18);
            return ValEdad;
        }
    
    }
        @Override
        public String toString()
                
        {
         return "Nombre: "+this.nombre+"Edad: "+this.edad+"Nombre: "+this.sueldo;
        }
}
