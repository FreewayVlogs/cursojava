/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import static java.lang.Math.*;
import javax.swing.JOptionPane;

/**
 *
 * @author mauriciouncag
 */
public class Ejercicios {

    String nombre;
    Double radio, area, volumen, interes, resultado, monto;
    int annos;
    String opcion = "12";

    public void entrarmatrix(String nombre) {

        this.nombre = nombre;
        JOptionPane.showMessageDialog(null, "Ahora estás en la matrix, ¡¡¡" + this.nombre + "...!!!”");

    }

    public void areavolesfera(String radio) {

        this.radio = Double.parseDouble(radio);
        this.area = 4 * PI * this.radio * pow(this.radio, 2);
        this.volumen = (4 / 3) * PI * pow(this.radio, 3);
        JOptionPane.showMessageDialog(null, "El area de la esfera es: " + this.area);
        JOptionPane.showMessageDialog(null, "El volumen de la esfera es: " + this.volumen);
    }

    public void interescompuesto(double monto, double interes, int annos) {

        this.monto = monto;
        this.interes = interes / 100;
        this.annos = annos;
        this.resultado = this.monto * pow((1 + this.interes), this.annos);
        JOptionPane.showMessageDialog(null, "EL valor de su inversión mas los intereses es: " + this.resultado);
    }

    public void MostrarOpciones() {

        opcion = JOptionPane.showInputDialog(
                "Seleccione una opción\n\n"
                + "1. Saludo Matrix\n"
                + "2. Area y Volumen de una esfera\n"
                + "3. Interes Compuesto\n"
                + "12. Salir\n\n");
    }

    public void menu() {

        do {
            switch (opcion) {
                case "1":
                    entrarmatrix(JOptionPane.showInputDialog("Escribe tu nomber: "));
                    MostrarOpciones();
                    menu();
                    break;
                case "2":
                    areavolesfera(JOptionPane.showInputDialog("Escribe el radio del a esfesa: "));
                    MostrarOpciones();
                    menu();
                    break;
                case "3":
                    interescompuesto(Double.parseDouble(JOptionPane.showInputDialog("Escribe tu monto: ")), Double.parseDouble(JOptionPane.showInputDialog("Escribe el interes: ")), Integer.parseInt(JOptionPane.showInputDialog("Escribe los años: ")));
                    MostrarOpciones();
                    menu();
                    break;
                case "12":
                    JOptionPane.showMessageDialog(null, "Cerrar menú");
                    opcion = "12";
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalidad");
                    MostrarOpciones();
                    menu();
                    break;
            }

        } while (opcion != "12");

    }

}
