package enums;

public enum InWords {
	TRUTH("Правда,"),
	BUT(", но "),
	BI("бы"),
	IF(", если "),
	AND(" и "),
	EVEN("даже"),
	WHEN(", когда "),
	STRAIGHT("прямо"),
	AS("Таких"),
	ANDNOW("А сейчас ");
	
	
	private String value;
	InWords(String val) {
		this.value = val;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
}
