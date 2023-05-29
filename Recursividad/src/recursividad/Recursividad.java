/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author Usuario
 */
public class Recursividad {

    public int invertirCifrasDeUnNumero(int numero, int posiciones) {
        if (numero < 10) {
            return numero;
        } else {
            return numero % 10 * (int) Math.pow(10, posiciones) + invertirCifrasDeUnNumero(numero / 10, posiciones - 1);
        }
    }
    
    public void mostrarPalabraLetraPorLetra(String palabra, int i) {
        if (i < palabra.length()) {
            System.out.println(palabra.charAt(i));
            mostrarPalabraLetraPorLetra(palabra, i + 1);
        }
    }

    public void vectorRecursivo(int[] vector, int i){
        if (i < vector.length){
            System.out.println(vector[i]);
            vectorRecursivo(vector, i+1);
        }
    }

    public int determinarMayorValor(int[] vector) {
        if (vector.length == 0) {
            return -1;
        } else {
            return mayorValor(vector, vector[0], 0);
        }
    }

    private int mayorValor(int[] vector, int valorMayor, int i) {
        if (i >= vector.length) {
            return valorMayor;
        } 
        else {
            return mayorValor(vector, valorMayor, i + 1);
        }
    }

    public int sumaNumerosRecursivamente(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumaNumerosRecursivamente(n - 1);
        }
    }
    
    public void tablaMultiplicarRecursiva(int multiplicando, int multiplicador) {
        if (multiplicador > 1) {
            tablaMultiplicarRecursiva(multiplicando, multiplicador - 1);
        }
        System.out.println(multiplicando + "x" + multiplicador + "=" + multiplicando * multiplicador);
    }
    
    public int sumarDigitosRecursivamente(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return sumarDigitosRecursivamente(numero / 10) + numero % 10;
        }
    }
}
