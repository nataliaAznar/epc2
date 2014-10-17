package calculadoraDeshacer;

import upm.jbb.IO;

public class ComandoGuardar extends ComandoMemento{

	public ComandoGuardar(CalculadoraMementable c) {
		super(c);
	}

	@Override
	public void execute() {
		String key = IO.in.readString("Clave del guardado");
		Memento memento = c.createMemento();
		ComandoMemento.m.addMemento(key, memento);
	}

	@Override
	public String name() {
		return "ComandoGuardar";
	}

}
