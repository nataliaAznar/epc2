package composite;

public abstract class Operaciones extends Expresion{
	Expresion exp1;
	Expresion exp2;
	
	public Operaciones (Expresion exp1, Expresion exp2){
		this.exp1 = exp1;
		this.exp2 = exp2;
		
	}

}
