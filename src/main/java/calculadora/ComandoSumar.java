package calculadora;

import upm.jbb.IO;

public class ComandoSumar implements Comando{
	
	private Calculadora c;
	
	public ComandoSumar( Calculadora c) {
		this.c = c;
	}

	@Override
	public void execute() {
		int x = IO.in.readInt("Introduzca un valor");
		this.c.sumar(x);
	}

	@Override
	public String name() {
		return "ComandoSumar";
	}

}
