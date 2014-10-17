package calculadora;

import upm.jbb.IO;

public class ComandoIniciar implements Comando{
	
	private Calculadora c;
	
	public ComandoIniciar( Calculadora c) {
		this.c = c;
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
