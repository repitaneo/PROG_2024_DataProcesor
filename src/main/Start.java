package main;

import excepciones.DataNotValidMarcosException;
import procesador.DataProcesor;

public class Start {

	public static void main(String[] args)  {
		
		DataProcesor dp = new DataProcesor();
		double[] valores = {9.83, 4.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00};
		

		dp.procesarDatos(valores);


	}

}
