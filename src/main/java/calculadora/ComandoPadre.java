package calculadora;

public abstract class ComandoPadre implements Comando{
	
	protected Calculadora c;
	
	public ComandoPadre( Calculadora c) {
		this.c = c;
	}

	public abstract void execute() ;

	public abstract String name() ;

}
