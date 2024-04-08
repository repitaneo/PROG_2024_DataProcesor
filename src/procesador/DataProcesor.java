package procesador;

import excepciones.DataNotValidMarcosException;

public class DataProcesor {

	
	/**
	 * procesar los datos que recibo sacandolos por pantalla
	 * @param procesar vector de datos a procesar

	 */
	public void procesarDatos(double[] procesar) {
	
		for (int i = 0; i < procesar.length; i++) {
			
			try {
				// operación que procesa los datos
				procesar(procesar[i]);
			}
			catch(DataNotValidMarcosException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	
	
	
	/**
	 * Operación que procesa un dato según los requisitos
	 * Los requisitos actuales son sacar el dato por pantalla
	 * @param dato
	 * @throws DataNotValidMarcosException se lanza esta excepción cuando el dato del parametro es <0
	 */
	private void procesar(double dato) throws DataNotValidMarcosException {
		
		if(dato<0) {
			throw new DataNotValidMarcosException("No procesado por no valido el ["+dato+"]");
		}
		System.out.println(dato);
	}
	
	
}
