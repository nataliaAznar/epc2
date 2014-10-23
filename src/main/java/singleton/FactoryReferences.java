package singleton;

import java.util.HashMap;
import java.util.Map;

public class FactoryReferences {
	private static FactoryReferences f; 
    private Map<String, Integer> references;

    private int reference;

    private FactoryReferences() {
        this.references = new HashMap<String, Integer>();
        this.reference = 0;
    }
    
    public static FactoryReferences getFactory(){
    	if( f == null)
    		f = new FactoryReferences();
    	return f;
    }

    public int getReference(String key) {
        Integer result = this.references.get(key);
        if (result == null) {
            this.references.put(key, this.reference);
            result = this.reference;
            reference++;
        }
        return result;
    }

    public void removeReference(String key) {
        this.references.remove(key);
    }

}
