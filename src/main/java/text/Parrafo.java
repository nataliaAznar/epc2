package text;


public class Parrafo extends Compuesto{

	@Override
	public void add(Componente c) throws UnsupportedOperationException{
		if ( c.isCompuesto()){
			UnsupportedOperationException e = new UnsupportedOperationException();
			throw e;
		}
		else
			this.componentes.add(c);
	}

	@Override
	public String dibujar(boolean mayusculas) {
		String parrafo = super.dibujar(mayusculas);
		parrafo = parrafo + '\n';
		return  parrafo;
				
	}

}
