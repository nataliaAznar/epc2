package state;

public class EstadoCerrado extends State{
	
	public void abrir(Conexion c) {
		c.setState(new EstadoPreparado());
	}
		
	public void parar(Conexion c) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public void iniciar(Conexion c) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public void enviar(Conexion c, String msg, Link link) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public void recibir(Conexion c, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public Estado getEstado() {
		return Estado.CERRADO;
	}

}
