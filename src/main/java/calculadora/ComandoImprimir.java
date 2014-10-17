package calculadora;

import upm.jbb.IO;

public class ComandoImprimir implements Comando {
	
	private Calculadora c;
	
	public ComandoImprimir( Calculadora c) {
		this.c = c;
	}

	@Override
	public void execute() {
		int x = this.c.getTotal();
		String y = x + "";
		y = y + '\n';
		IO.out.print(y);
	}

	@Override
	public String name() {
		return "ComandoImprimir";
	}

}
