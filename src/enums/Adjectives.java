package enums;

public enum Adjectives {
	BRIGTH("�����"),
	TRANSPARENT("����������"),
	BLUE("�����"),
	FADED("�������"),
	FAIRY("���������");
	
	
	private String value;
	Adjectives(String val) {
		this.value = val;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
}
