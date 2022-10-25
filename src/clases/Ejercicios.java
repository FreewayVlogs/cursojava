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
    Double radio,area,volumen,interes,resultado,monto;
    int annos;
    
    public void entrarmatrix (String nombre) {
        
        this.nombre = nombre;
        JOptionPane.showMessageDialog(null, "Ahora estás en la matrix, ¡¡¡" + this.nombre +"...!!!”" );
    
    }
    
    public void areavolesfera (String radio) {
        
        this.radio = Double.parseDouble(radio);
        this.area = 4* PI * this.radio * pow(this.radio, 2);
        this.volumen = (4/3) * PI * pow(this.radio, 3);
        JOptionPane.showMessageDialog(null, "El area de la esfera es: " + this.area);
        JOptionPane.showMessageDialog(null, "El volumen de la esfera es: " + this.volumen);
    }
    
        public void interescompuesto (double monto,double interes,int annos) {
            
        this.monto = monto;    
        this.interes = interes/100; 
        this.annos = annos; 
        this.resultado = this.monto * pow((1+this.interes),this.annos);
        JOptionPane.showMessageDialog(null, "EL valor de su inversión mas los intereses es: " + this.resultado);
    }
    
    
}
