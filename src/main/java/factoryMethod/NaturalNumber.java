package factoryMethod;

public class NaturalNumber {
	protected int value;

	public NaturalNumber(int value) {
		this.setValue(value);
	}

	public void setValue(int value) {
		assert value >= 0;
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void add(int value) {
		this.setValue(this.value + value);
	}

	public String getTextValue(String[] textValue) {
		if (this.value < textValue.length) {
			return textValue[this.value];
		} else {
			return "???";
		}
	}

}
