package factoryMethod;

public class NaturalNumberEnCreator extends NaturalNumberCreator {

	@Override
	public NaturalNumber createNaturalNumber(int number) {
		return new NaturalNumberEn(number);
	}

}
