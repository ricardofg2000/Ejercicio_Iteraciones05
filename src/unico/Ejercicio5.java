package unico;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 Desarrollar un programa que solicite los valores mínimo y máximo de un rango. 
		 A continuación, solicitará por teclado un valor que debe estar dentro del rango. 
		 Si no es asi, volverá a solicitar un número, y así repetidas veces hasta que el valor esté dentro del rango..
		 */

		Scanner leer = new Scanner (System.in);
		int min;
		int max;
		int num = 0;
		
		System.out.print("Introduzca el valor mínimo: ");
		min = Integer.parseInt(leer.nextLine());
		System.out.print("Introduzca el valor máximo: ");
		max = Integer.parseInt(leer.nextLine());
		
		System.out.print("Introduzca un valor entre " + min + " y " + max + ": ");
		num = Integer.parseInt(leer.nextLine());
		while (num < min || num > max){
			System.out.println("El número no está entre los dos valores ");
			System.out.print("Vuelva a introduzca un valor entre " + min + " y " + max + ": ");
			num = Integer.parseInt(leer.nextLine());
		}
		
	}
}