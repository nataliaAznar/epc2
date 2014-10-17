package calculadora;

import upm.jbb.IO;

public class ComandoIniciar extends ComandoPadre{
	
	public ComandoIniciar(Calculadora c) {
		super(c);
	}

	@Override
	public void execute() {
		this.c.iniciar();
	}

	@Override
	public String name() {
		return "ComandoIniciar";
	}

}
