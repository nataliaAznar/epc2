package calculadoraDeshacer;

import calculadora.Calculadora;

public class CalculadoraMementable extends Calculadora implements Mementable<Memento>{

	
	public Memento createMemento() {
		return new Memento(this.getTotal());
	}

	
	public void restoreMemento(Memento memento) {
		this.setTotal(memento.getTotal());
		
	}


}
