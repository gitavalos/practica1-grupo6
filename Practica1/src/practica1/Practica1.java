/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Avalo
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        String opcion = "S";
        System.out.println("Bienvenido al sistema de operaciones.");
        do {
            System.out.println("------------------------------------\n"
                    + "Seleccione la operacion a realizar:\n"
                    + "1	Raiz Cubica\n"
                    + "2	Potencia Cubo\n"
                    + "3	Potencia \n"
                    + "4	Factorial\n"
                    + "5	Raiz Cuadrada\n"
                    + "6	Multiplicacion\n"
                    + "7       Division\n"
                    + "S	Salir\n"
                    + "-------------------------------------");
            opcion = reader.next();
            int Numero1 = 0;
            int Numero2 = 0;
            switch (opcion) {
                case "1":
                    System.out.println("Ingrese numero para calculo de raiz cubica");
                    Numero1 = reader.nextInt();
                    System.out.println("Su resultado es:");
                    System.out.println(RaizCubica.RaizCubica(Numero1));
                    break;
                case "2":
                    System.out.println("Ingrese numero para calculo de potencia cubica");
                    Numero1 = reader.nextInt();
                    System.out.println("Su resultado es:");
                    System.out.println(PotenciaCubo.potenciacubo(Numero1));
                    break;
                case "3":
                    System.out.println("Ingrese primer numero para calculo de potencia");
                    Numero1 = reader.nextInt();
                    System.out.println("Ingrese segundo numero");
                    Numero2 = reader.nextInt();
                    System.out.println("Su resultado es:");
                    System.out.println(RaizCubica.RaizCubica(Numero1));
                    break;
                case "4":
                    System.out.println("Ingrese numero para calculo de factorial");
                    Numero1 = reader.nextInt();
                    System.out.println("Su resultado es:");
                    System.out.println(Factorial.factorial(Numero1));
                    break;
                case "5":
                    System.out.println("Ingrese numero para calculo de raiz cuadrada");
                    Numero1 = reader.nextInt();
                    System.out.println("Su resultado es:");
                    System.out.println(RaizCuadrada.RaizCuadrada(Numero1));
                    break;
                case "6":
                    System.out.println("Ingrese primer numero para calculo de multiplicacion");
                    Numero1 = reader.nextInt();
                    System.out.println("Ingrese segundo numero");
                    Numero2 = reader.nextInt();
                    System.out.println("Su resultado es:");
                    System.out.println(Multiplicacion.Multiplicacion(Numero1, Numero2));
                    break;
                case "7":
                    System.out.println("Ingrese primer numero para calculo de division");
                    Numero1 = reader.nextInt();
                    System.out.println("Ingrese segundo numero");
                    Numero2 = reader.nextInt();
                    System.out.println("Su resultado es:");
                    System.out.println(Division.Division(Numero1, Numero2));
                    break;
                default:
                    System.out.println("Saliendo del sistema....");
            }
        } while (!opcion.toUpperCase().equals("S"));
    }

}
