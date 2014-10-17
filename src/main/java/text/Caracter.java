package text;

public class Caracter extends Componente{
	char valor;
	
	public Caracter( char valor ){
		this.valor = valor;
	}

	@Override
	public void add(Componente c) {
		
		
	}

	@Override
	public String dibujar(boolean mayusculas) {
		if(mayusculas){
			return Character.toString(this.valor).toUpperCase();
		}
		else return Character.toString(this.valor);
		
	}
	
	@Override
	public boolean isCompuesto(){
		return false;
	}

}
