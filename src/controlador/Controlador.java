package controlador;

import modelo.ModeloPrincipal;
import vista.VistaPrincipal;

public class Controlador {
	private ModeloPrincipal modelo;
	private VistaPrincipal vista;
	
	public void setModelo(ModeloPrincipal modelo) {
		this.modelo = modelo;
	}


	public void setVistaPrincipal(VistaPrincipal vistaPrincipal) {
		this.vista = vistaPrincipal;
	}

}
