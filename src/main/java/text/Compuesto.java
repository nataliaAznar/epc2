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
		
		texto = texto + '\n';
		return texto;
	}
	
	@Override
	public boolean isCompuesto(){
		return true;
	}

}
