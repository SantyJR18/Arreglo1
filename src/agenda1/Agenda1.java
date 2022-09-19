/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agenda1;

/**
 *
 * @author isi7
 */
public class Agenda1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto[] misProducto = new Producto[10];
        Producto cafe = new Producto(1, "cafe", 90);
        Producto pan = new Producto(1, "pan", 35);
        Producto desayuno = new Producto(3, "desayuno tipico", 80);

        misProducto[0] = cafe;
        misProducto[1] = pan;
        misProducto[2] = desayuno;

        double monto = 0;

        for (Producto prod : misProducto) {
            System.out.println(prod);
            if(prod != null)monto += prod.getPrecio();
        }
        System.out.println("Monto a Pagar " + monto);
        /* int [] numero = {1, 2, 3, 4, 5};
        for (int i = 0; i < numero.length; i++){
        }*/
    }
}
