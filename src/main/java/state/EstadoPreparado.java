package state;

public class EstadoPreparado extends State{
	
	
	public void cerrar(Conexion c) {
		c.setState(new EstadoCerrado());
	}
	
	public void parar(Conexion c) {
		c.setState(new EstadoParado());
	}
	
	public void enviar(Conexion c, String msg, Link link) {
		link.enviar(msg);
		c.setState(new EstadoEsperando());
	}
	
	public void recibir(Conexion c, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public Estado getEstado() {
		return Estado.PREPARADO;
	}

}
