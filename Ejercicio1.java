package exprogDiciembre1Ev;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));//Leo una linea caracter a caracter
        char[]v=in.readLine().toLowerCase().toCharArray();//Creo un array de caracteres, almaceno los leidos, y convierto 
        //el String en un array de caracteres
        Arrays.sort(v);//Ordeno los caracteres del array de manera descedente
        System.out.println(Arrays.toString(v));//Devuelve la representacion String de los contenidos del array especificado
	}

}

