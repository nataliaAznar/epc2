package state;

public class Conexion {
    private State state;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.state = new EstadoCerrado();
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return this.state.getEstado();
    }

    protected void setState(State state) {
		this.state = state;
	}

    public void abrir() {
    	state.abrir(this);
    }

    public void cerrar() {
    	state.cerrar(this);
    }

    public void parar() {
    	state.parar(this);
    }

    public void iniciar() {
    	state.iniciar(this);
    }

    public void enviar(String msg) {
    	state.enviar(this, msg, this.link);
    }

    public void recibir(int respuesta) {
    	state.recibir(this, respuesta);
    }

}
