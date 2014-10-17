package text;


public class Texto extends Compuesto{

	@Override
	public void add(Componente c) {
		if ( !c.isCompuesto()){
			UnsupportedOperationException e = new UnsupportedOperationException();
			throw e;
		}
		else
			this.componentes.add(c);
		
	}

	@Override
	public String dibujar(boolean mayusculas) {
		String texto =  super.dibujar(mayusculas);
		texto = texto + "---o---";
		return texto;
			
	}

}
