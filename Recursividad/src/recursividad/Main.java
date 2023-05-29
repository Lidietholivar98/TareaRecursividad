/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Recursividad r = new Recursividad();
        
        //Ejercicio 1
        int numeroAInvertir = 345;
        int posiciones = String.valueOf(numeroAInvertir).length();
        System.out.println("Resultado invertir cifras: " + r.invertirCifrasDeUnNumero(numeroAInvertir, posiciones - 1));
        
        //Ejercicio 2
        r.mostrarPalabraLetraPorLetra("Hola", 0);
        
        //Ejercicio 3        
        int [] vec = {69,8,61,45,1};
        r.vectorRecursivo(vec, 0);
        System.out.println("Mayor valor: " + r.determinarMayorValor(vec));
        
        //Ejercicio 4
        System.out.println("Resultado suma recursiva: " + r.sumaNumerosRecursivamente(10));
        
        //Ejercicio 5
        System.out.println("--------");
        r.tablaMultiplicarRecursiva(3, 9);
        System.out.println("--------");
        
        //Ejercicio 6
        System.out.println("Suma digitos recursivo: " + r.sumarDigitosRecursivamente(893));
    }
}
