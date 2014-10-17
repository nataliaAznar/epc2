package calculadoraDeshacer;

import upm.jbb.IO;

public class ComandoDeshacer extends ComandoMemento{

	public ComandoDeshacer(CalculadoraMementable c) {
		super(c);
	}

	@Override
	public void execute() {
		String key = (String) IO.in.select(ComandoMemento.m.keys());
		Memento memento = ComandoMemento.m.getMemento(key);
		c.restoreMemento(memento);
	}

	@Override
	public String name() {
		return "ComandoDeshacer";
	}

}
