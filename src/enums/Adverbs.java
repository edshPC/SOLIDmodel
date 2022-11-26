package enums;

public enum Adverbs {
	TOTALLY("совсем"),
	REALLY("искренне"),
	FAST("стремительно"),
	SO("такими");
	
	
	private String value;
	Adverbs(String val) {
		this.value = val;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
}
