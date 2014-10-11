package state;

public abstract class State {
//    CERRADO, PARADO, PREPARADO, ESPERANDO;
	
	public abstract Estado getEstado();
	
	public void abrir(Conexion c) {
		
	}
	
	public void cerrar(Conexion c) {
		
	}
	
	public void parar(Conexion c) {
		
	}
	
	public void iniciar(Conexion c) {
		
	}
	
	public void enviar(Conexion c, String msg, Link link) {
		
	}
	
	public void recibir(Conexion c, int respuesta) {
		
	}
	
}
