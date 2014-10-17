package calculadoraDeshacer;

import calculadora.Calculadora;

public class CalculadoraMementable extends Calculadora implements Mementable<Memento>{

	@Override
	public Memento createMemento() {
		return new Memento(this.getTotal());
	}

	@Override
	public void restoreMemento(Memento memento) {
		this.setTotal(memento.getTotal());
		
	}


}
