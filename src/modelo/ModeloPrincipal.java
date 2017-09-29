package modelo;

import vista.VistaPrincipal;

public class ModeloPrincipal {
	private VistaPrincipal  vista;
	private ModeloSQL modeloSql;
	private ModeloFichero modeloFichero;
	public void setVistaPrincipal(VistaPrincipal vistaPrincipal) {
		this.vista = vistaPrincipal;
		
	}
	
	public void setModeloSQL(ModeloSQL modelo) {
		this.modeloSql = modelo;
	}
	
	public void setModeloFichero(ModeloFichero modelo) {
		this.modeloFichero = modelo;
	}

}
