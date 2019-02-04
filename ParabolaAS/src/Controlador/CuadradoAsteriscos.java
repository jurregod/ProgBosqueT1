package Controlador;

import java.util.Scanner;

public class CuadradoAsteriscos {
	 
    public static void main(String[] args) {
 
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el lado del cuadrado: ");
        int lado = teclado.nextInt();
        teclado.close();
 
        System.out.println();
        for(int row=1; row<=lado; row++){
            for(int col=1; col<=lado; col++){
                if(row==1 || row==lado || col==1 || col==lado){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}