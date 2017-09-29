package launcher;

import controlador.Controlador;
import modelo.ModeloFichero;
import modelo.ModeloPrincipal;
import modelo.ModeloSQL;
import vista.VistaPrincipal;

public class launcher {
	public static void main(String[] args) {
		VistaPrincipal vistaPrincipal = new VistaPrincipal();
		ModeloPrincipal modelo = new ModeloPrincipal();
		
		ModeloSQL modeloSql = new ModeloSQL();
		ModeloFichero modeloFichero = new ModeloFichero();
		
		Controlador controlador = new Controlador();
		
		controlador.setModelo(modelo);
		controlador.setVistaPrincipal(vistaPrincipal);


		vistaPrincipal.setControlador(controlador);
		vistaPrincipal.setModelo(modelo);

		modelo.setVistaPrincipal(vistaPrincipal);
		
		modelo.setModeloFichero(modeloFichero);
		modelo.setModeloSQL(modeloSql);
		
		

		
		
	}
	

}
