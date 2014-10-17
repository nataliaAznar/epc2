package calculadora;

import upm.jbb.IO;

public class ComandoRestar extends ComandoPadre implements Comando{
	
	public ComandoRestar(Calculadora c) {
		super(c);
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
