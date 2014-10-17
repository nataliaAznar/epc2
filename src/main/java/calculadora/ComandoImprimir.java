package calculadora;

import upm.jbb.IO;

public class ComandoImprimir extends ComandoPadre implements Comando {
	
	public ComandoImprimir(Calculadora c) {
		super(c);
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
