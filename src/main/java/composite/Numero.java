package composite;

public class Numero extends Expresion {
	int num;	

	public Numero(int num) {
		this.num = num;
	}

	@Override
	public int operar() {
		return num;
	}

	@Override
	public String toString() {
		return ""+num;
	}

}
