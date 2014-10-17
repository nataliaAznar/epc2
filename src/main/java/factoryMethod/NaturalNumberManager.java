package factoryMethod;

public class NaturalNumberManager {
	 private NaturalNumber naturalNumber;

    private NaturalNumberCreator creator;

    public void setCreator(NaturalNumberCreator creator) {
        this.creator = creator;
    }

    public void createNaturalNumber(int number) {
        this.naturalNumber = this.creator.createNaturalNumber(number);
    }

    public NaturalNumber getNaturalNumber() {
        return naturalNumber;
    }

}
