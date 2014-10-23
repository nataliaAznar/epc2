package calculadoraDeshacer;

import calculadora.Comando;

public abstract class ComandoMemento implements Comando{
	protected CalculadoraMementable c;
	protected static GestorMementos m = new GestorMementos();
	
	public ComandoMemento( CalculadoraMementable c ) {
		this.c = c;
	}

	public abstract void execute() ;

	public abstract String name();

}
