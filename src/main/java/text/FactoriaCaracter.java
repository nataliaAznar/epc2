package text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
		private static FactoriaCaracter f;
		private Map<Character, Caracter> caracteres;
		
		private FactoriaCaracter(){
			caracteres = new HashMap<Character, Caracter>();
		}
		
		public static FactoriaCaracter getFactoria(){
	    	if( FactoriaCaracter.f == null)
	    		FactoriaCaracter.f = new FactoriaCaracter();
	    	return FactoriaCaracter.f;
	    }
		
		public Caracter get( Character key){
			if(!caracteres.containsKey(key)){
				Caracter c = new Caracter(key);
				caracteres.put(key, c);
			}
		return caracteres.get(key);
		}

}
