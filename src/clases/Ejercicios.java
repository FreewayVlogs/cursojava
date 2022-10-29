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

    String nombre, numer, opcion = "12";
    Double radio, area, volumen, interes, resultado, monto, lado, diametro, perimetro, diagonal, altura, areala, distancia, x1, x2, y1, y2, alpha, beta, theta, lado2, lado3;
    int annos, validacion;

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

    public void perimetroCuadrado(double lado) {

        this.resultado = lado * 4;
        JOptionPane.showMessageDialog(null, "El perimetro del cuadrado es: " + this.resultado);
    }

    public void areaperimetrocirculo(String diametro) {

        this.diametro = Double.parseDouble(diametro);
        this.radio = this.diametro / 2;
        this.area = PI * pow(this.radio, 2);
        this.perimetro = 2 * PI * this.radio;
        JOptionPane.showMessageDialog(null, "El area del circulo es: " + this.area);
        JOptionPane.showMessageDialog(null, "El perimetro del circulo es: " + this.perimetro);
    }

    public void ValidacionNumero(String numero) {

        this.validacion = numero.length();
        if (this.validacion == 6) {

            JOptionPane.showMessageDialog(null, "Hay " + numero.charAt(5) + " unidades, " + numero.charAt(4) + " decenas, " + numero.charAt(3) + " centenas, " + numero.charAt(2) + " milésimas, " + numero.charAt(1) + " unidades de diez mil y " + numero.charAt(0) + " unidades de cien mil.");

        } else {

            JOptionPane.showMessageDialog(null, "El numero no debe tener decimales y deber de 6 digitos");
        }
    }

    public void arearectangulo(String diagonal, String lado) {

        this.lado = Double.parseDouble(lado);
        this.diagonal = Double.parseDouble(diagonal);
        this.altura = sqrt(pow(this.diagonal, 2) - pow(this.lado, 2));
        this.area = this.lado * this.altura;
        JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + this.area);
    }

    public void areavolumencono(String radio, String altura) {

        this.radio = Double.parseDouble(radio);
        this.altura = Double.parseDouble(altura);
        this.lado = sqrt(pow(this.radio, 2) - pow(this.altura, 2));
        this.areala = PI * this.radio * this.lado;
        this.area = this.areala + (PI * this.radio * (this.radio + this.lado));
        this.volumen = (PI * this.radio * this.altura) / 3;
        JOptionPane.showMessageDialog(null, "El area del cono es: " + this.area);
        JOptionPane.showMessageDialog(null, "El volumen del cono es: " + this.volumen);
    }

    public void espaciolibrecilimdro(String diametro, String altura) {

        this.radio = Double.parseDouble(diametro) / 2;
        this.altura = Double.parseDouble(altura);
        this.lado = sqrt(pow(this.radio, 2) - pow(this.altura, 2));
        this.areala = PI * this.radio * this.lado;
        this.area = this.areala + (PI * this.radio * (this.radio + this.lado));
        this.volumen = ((PI * pow(this.radio, 2) * this.altura)) - ((PI * pow(this.radio, 2) * this.altura) / 3);
        JOptionPane.showMessageDialog(null, "El volumen libre del cilindro es: " + this.volumen);
    }

    public void distanciaentrepuntos(String x1, String y1, String x2, String y2) {

        this.x1 = Double.parseDouble(x1);
        this.y1 = Double.parseDouble(y1);
        this.x2 = Double.parseDouble(x2);
        this.y2 = Double.parseDouble(y2);
        this.diagonal = sqrt(pow((this.x2 - this.x1), 2) + pow((this.y2 - this.y1), 2));

        JOptionPane.showMessageDialog(null, "La distancia entre los dos puntos: " + this.diagonal);
    }

    public void resolvertriangulo(String lado, String lado2, String alpha) {

        this.lado = Double.parseDouble(lado);
        this.lado2 = Double.parseDouble(lado2);
        this.alpha = Double.parseDouble(alpha);
        this.lado3 = sqrt(pow(this.lado, 2) + pow(this.lado2, 2) - 2 * this.lado * this.lado * cos(this.alpha));
        this.beta = sin((this.lado * sin(this.alpha)) / this.lado3);
        this.theta = 180-this.beta- this.alpha;

        JOptionPane.showMessageDialog(null, "Los lados del trangulo son: " + this.lado + "," + this.lado2 + "," + this.lado3 + "y sus angulos son: " + this.alpha + "," + this.beta + "," + this.theta );
    }

    public void MostrarOpciones() {

        opcion = JOptionPane.showInputDialog(
                "Seleccione una opción\n\n"
                + "1. Saludo Matrix\n"
                + "2. Area y Volumen de una esfera\n"
                + "3. Interes Compuesto\n"
                + "4. Perimetro cuadrado\n"
                + "5. Area y Perimetro circulo\n"
                + "6. Validación numero\n"
                + "7. Area rectangulo lado y diagonal\n"
                + "8. Area y Volumen de un cono\n"
                + "9. Volume libre de un cilindro con un cono de radio y altura igua dentro\n"
                + "10. Distancia entre punton\n"
                + "11. Resolver truangulo\n"
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
                case "4":
                    perimetroCuadrado(Double.parseDouble(JOptionPane.showInputDialog("Escribe la longitud de un lado: ")));
                    MostrarOpciones();
                    menu();
                    break;
                case "5":
                    areaperimetrocirculo(JOptionPane.showInputDialog("Escriba el dametro del circulo: "));
                    MostrarOpciones();
                    menu();
                    break;
                case "6":
                    ValidacionNumero(JOptionPane.showInputDialog("Escriba un numero entero de seis cifras: "));
                    MostrarOpciones();
                    menu();
                    break;
                case "7":
                    arearectangulo(JOptionPane.showInputDialog("Escriba longitud de la diagonal: "), JOptionPane.showInputDialog("Digite la longitud del lado: "));
                    MostrarOpciones();
                    menu();
                    break;
                case "8":
                    areavolumencono(JOptionPane.showInputDialog("Digite el radio del cono: "), JOptionPane.showInputDialog("Digite la altura del cono: "));
                    MostrarOpciones();
                    menu();
                    break;
                case "9":
                    areavolumencono(JOptionPane.showInputDialog("Digite el diametro del cilindro: "), JOptionPane.showInputDialog("Digite la altura del cilindro: "));
                    MostrarOpciones();
                    menu();
                    break;
                case "10":
                    distanciaentrepuntos(JOptionPane.showInputDialog("Digite del punto a X: "), JOptionPane.showInputDialog("Digite del punto a Y: "), JOptionPane.showInputDialog("Digite del punto b X: "), JOptionPane.showInputDialog("Digite del punto b Y: "));
                    MostrarOpciones();
                    menu();
                    break;
                case "11":
                    resolvertriangulo(JOptionPane.showInputDialog("Digite lado a: "), JOptionPane.showInputDialog("Digite lado b: "), JOptionPane.showInputDialog("Digite angulo: "));
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
