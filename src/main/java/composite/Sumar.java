package composite;

public class Sumar extends Operaciones{
	public Sumar(Expresion exp1, Expresion exp2) {
		super(exp1, exp2);
	}
	
	@Override
	public int operar() {
		return exp1.operar() + exp2.operar();
	}
	@Override
	public String toString() {
		return "(" + exp1.toString() + "+" + exp2.toString() + ")";
	}
	

}
