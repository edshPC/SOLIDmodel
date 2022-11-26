package enums;

public enum Adjectives {
	BRIGTH("ясный"),
	TRANSPARENT("прозрачный"),
	BLUE("синий"),
	FADED("блеклый"),
	FAIRY("сказочный");
	
	
	private String value;
	Adjectives(String val) {
		this.value = val;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
}
