package calculadora;

import upm.jbb.IO;

public class ComandoRestar implements Comando{
	
	private Calculadora c;
	
	public ComandoRestar( Calculadora c) {
		this.c = c;
	}

	@Override
	public void execute() {
		int x = IO.in.readInt("Introduzca un valor");
		this.c.restar(x);
	}

	@Override
	public String name() {
		return "ComandoRestar";
	}

}
