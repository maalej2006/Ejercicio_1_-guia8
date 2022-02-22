/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1_g8_razaperros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandro Lopez
 */
public class Ej1_G8_RazaPerros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<String> razasdeperro = new ArrayList();

        int opcion = 1;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        while (opcion != 0) {
            System.out.println("Ingrese una raza de perros");
            razasdeperro.add(leer.next());
            System.out.println("Desea ingresar otra raza: \n"
                    + "Presione 1 para continuar guardando \n"
                    + "Presione 0 para salir y mostrar las razas ingresadas");
          opcion = leer.nextInt();
        }
        System.out.println("Las razas ingresadas son:");
        for (String string : razasdeperro) {
            System.out.println(string);
        }
    }

}
