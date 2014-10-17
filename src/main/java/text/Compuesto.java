package text;

import java.util.ArrayList;
import java.util.List;

public abstract class Compuesto extends Componente{
	List<Componente> componentes = new ArrayList<Componente>();
	
	public abstract void add(Componente c);
	
	public String dibujar ( boolean mayusculas){
		String texto = "";
		for ( Componente c : componentes){
			texto = texto + c.dibujar(mayusculas);
		}
		
		return texto;
	}
	
	@Override
	public boolean isCompuesto(){
		return true;
	}
	
	public void delete ( Componente c){
		if ( this.componentes.contains(c))
			this.componentes.remove(c);
	}

}
