package state;

public class EstadoEsperando extends State{
	
	public void abrir(Conexion c) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	public void cerrar(Conexion c) {
		throw new UnsupportedOperationException("Acción no permitida... ");
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
		if (respuesta == 0) {
            c.setState(new EstadoPreparado());
        } else {
            c.setState(new EstadoCerrado());
        }
	}

	@Override
	public Estado getEstado() {
		return Estado.ESPERANDO;
	}

}
