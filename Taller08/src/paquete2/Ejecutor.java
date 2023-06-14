/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;
import paquete1.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese nombres");
            String nombres = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String identificacion = entrada.nextLine();


            System.out.println("Ingrese: \n"
                    + "1. Para crear un DocenteNombramiento\n"
                    + "2. Para crear un DocenteFactura\n");
            int op = entrada.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el valor del sueldo");
                    int valorSueldo = entrada.nextInt();
                    System.out.println("Ingrese el valor de las hora extra");
                    int valorExtra = entrada.nextInt();
                    System.out.println("Ingrese el numero de las horas extras");
                    int num = entrada.nextInt();
                    entrada.nextLine();
                    
                    DocenteNombramiento dN = new DocenteNombramiento();
                    dN.establecerNombres(nombres);
                    dN.establecerCedula(identificacion);
                    dN.establecerValorSueldo(valorSueldo);
                    dN.establecerValorHoraExtra(valorExtra);
                    dN.establecerNumeroHorasExtra(num);
                    dN.establecerSueldo();
                    
                    System.out.println(dN);
                    

                    break;
                case 2:
                    System.out.println("Ingrese el valor de la factura");
                    double valorFactura = entrada.nextDouble();
                    entrada.nextLine();
                    
                    DocenteFactura dF = new DocenteFactura();
                    dF.establecerNombres(nombres);
                    dF.establecerCedula(identificacion);
                    dF.establecerVfactura(valorFactura);
                    dF.establecerIva();
                    dF.establecerValorCancelar();
                    System.out.println(dF);

                    break;
                default:
                    System.out.println("Error, opción no válida.");

            }
            
            System.out.println("ingrese 1 si desea salir, de lo contrario ingrese cualquier otro numero ");
            int n = entrada.nextInt();
            
            if (n == 1) {
                bandera = false;
            }

        }
    }
}
