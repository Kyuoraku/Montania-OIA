package lectura;

import java.io.*;

import clases.Punto;

/*
 * Datos de entrada
Se recibe un archivo montaña.in del directorio
actual, que contiene la descripción de una
montaña. Una montaña se describe por una
primer línea que contiene un entero M, 1 ≤ M ≤
2.000.000 , que representa la cantidad sumada de
cimas más valles de la montaña. A continuación el
archivo contiene M líneas con las coordenadas
enteras 0 ≤ Y ≤ 1.000.000.000 de las alturas de
cimas y valles de la montaña. Todos estos puntos
vienen ordenados por coordenadas crecientes de
X. La primera corresponde a una cima de
coordenada X = 0, a partir de la cual se alternan
valles y cimas. Finalmente una línea conteniendo
la coordenada X de la posición inicial del carrito.
Las coordenadas X se mantienen en el mismo
rango de 0 a 1.000.000.000
 */
public class Datos {
	
	public static void Lectura(){
	
		BufferedReader br;
		String linea = "";
		
		try {
			
			br = new BufferedReader(new FileReader("./montaña.in"));	//se abre el archivo
			linea = br.readLine();										//se lee la primera linea
			
			Punto[] cantidad = new Punto[Integer.parseInt(linea)];		//se crea un array de la cantidad de puntos q hay
			
			Punto a = new Punto(10.0,40.0);
			Punto b = new Punto(40.0,10.0);
			
			System.out.println(a.calcularDistancia(b));
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void main(String [] a) {
		Datos.Lectura();
	}
}
