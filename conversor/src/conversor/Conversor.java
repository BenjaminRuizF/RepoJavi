/*Escribe un conversor de euros a varias monedas mediante la instrucción switch.

El programa debe presentar por pantalla un menú como el que sigue:

Selecciona una opción:

{D}ólar

{Y}en japonés

{L}ibra esterlina

A continuación, el programa ha de solicitar una cantidad en euros, que será traducida a la moneda seleccionada.

El usuario podrá introducir D, Y o L en mayúscula o minúscula.

El programa debe informar si la opción introducida es incorrecta.

Lo que sigue es un ejemplo de ejecución del programa:

Introduce una cantidad en euros: 12
Selecciona una opción:
(D)ólar
(Y)en japonés
(L)ibra esterlina
d
12.00 euros son 16.20 dólares.

Lo que sigue es otro ejemplo de ejecución del programa:

Introduce una cantidad en euros: 100
Selecciona una opción:
(D)ólar
(Y)en japonés
(L)ibra esterlina
R
La opción introducida es incorrecta
 * 
 */
package conversor;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Introduce un acantidad en euros:");
		double euros = teclado.nextInt();
		double dolar =  (euros / 1.01);
		double yen = (euros / 0.0070);
		double libra = (euros / 1.14);
		System.out.println("Seleciona una opcion \n (D)olar \n (Y)en Japones \n (L)ibra esterlina \n");
		char letra = teclado.next().charAt(0);
		switch(letra) {
		case 'D':
		case 'd':
			System.out.println(euros+ " euros son "+dolar+" dolares");
			break;
		case 'Y':
		case 'y':
			System.out.println(euros+ " euros son  "+yen+" yenes");
			break;
		case 'L':
		case 'l':
			System.out.println(euros+ " euros son "+libra+" libras esterlinas");
			break;
		default: System.out.println("No has introducido una moneda valida");
		}
		teclado.close();

	}

}
