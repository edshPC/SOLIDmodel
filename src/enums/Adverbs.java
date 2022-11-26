package enums;

public enum Adverbs {
	TOTALLY("������"),
	REALLY("��������"),
	FAST("������������"),
	SO("������");
	
	
	private String value;
	Adverbs(String val) {
		this.value = val;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
}
