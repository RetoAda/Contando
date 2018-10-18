package es.unex.cum.retoada;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();

		//Lo primero es leer lo introducido por teclado
		Scanner s = new Scanner (System.in);
		int entrada = s.nextInt();
		int lista [] = new int [2];
		lista [0] = entrada; //voy guardando en la lista lo que me va metiendo por teclado
		entrada = s.nextInt();	
		lista [1] = entrada;
		
		m.contando(lista);

	}
	
	public void contando (int lista []) {
		for (int i=0; i<lista.length; i++) {
			int numero = lista[i]; //numero introducido por teclado
			int cont = 0; //cantidad de numeros puede realizar tal que la suma de los digitos sea igual a numero
			
			for (int j=1; j<445; j++) { //el ultimo numero que podre sumar es el 444
				//ahora tengo que separar los digitos de j para sumarlos
				int suma = 0;
				int n = j;
				String nu = Integer.toString(n);
				for (int z=1; z<=nu.length(); z++) {
					int x = n%10;
					n = n/10;
					if (x>0 && x<5) {
						if (x==4) x=1;
						suma = suma + x;
					}
					else {
						suma = 0;
						break;
					}
				}
				if (suma == numero) {
					cont ++;
				}
			}
			System.out.println(cont);
		}
	}

}
