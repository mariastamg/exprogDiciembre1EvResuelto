package exprogDiciembre1Ev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("Introduce el valor de la variable: ");
			double x=Double.parseDouble(in.readLine());
			System.out.println("Introduce los coeficientes: ");
			System.out.println("Resultado "+evaluar(x,in.readLine().split(" ")));
		}while(!fin(in));

	}
	
	static double evaluar(double x,String[]coeficientes) {
		double resultado=Double.parseDouble(coeficientes[0]);
		for(int i=1;i<coeficientes.length;i++)
			resultado+=Double.parseDouble(coeficientes[i])*Math.pow(x, i);
		return resultado;
		
	}
	
	static boolean fin(BufferedReader in)throws IOException{
		String respuesta;
		boolean respuestaIncorrecta;
		do {
			System.out.println("¿Deseas evaluar otro polinomio?(si/no)");
			respuesta=in.readLine();
			if(respuestaIncorrecta=!respuesta.equalsIgnoreCase("si")&&!respuesta.equalsIgnoreCase("no"))
				System.out.println("Respuesta incorrecta");
		}while(respuestaIncorrecta);
		return (respuesta.equalsIgnoreCase("no"));
	}

}
