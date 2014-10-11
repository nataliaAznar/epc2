package factoryMethod;

public class NaturalNumberEsCreator extends NaturalNumberCreator{

	@Override
	public NaturalNumber createNaturalNumber(int number) {
		return new NaturalNumberEs(number);
	}

}
