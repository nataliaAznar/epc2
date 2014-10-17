package calculadora;

import upm.jbb.IO;

public class ComandoSumar extends ComandoPadre implements Comando{
	
	public ComandoSumar(Calculadora c) {
		super(c);
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
