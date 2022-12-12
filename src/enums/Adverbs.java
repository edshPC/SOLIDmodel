package enums;

public enum Adverbs {
	TOTALLY("совсем"),
	REALLY("искренне"),
	FAST("стремительно"),
	SO("такими"),
	JUSTSPECIAL("словно специально");
	
	
	private String value;
	Adverbs(String val) {
		this.value = val;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
}
