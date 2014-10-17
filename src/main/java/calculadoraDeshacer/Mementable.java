package calculadoraDeshacer;

public interface Mementable<T> { 
	
    T createMemento(); 
 
    void restoreMemento(T memento); 

} 
