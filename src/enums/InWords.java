package enums;

public enum InWords {
	TRUTH("������,"),
	BUT(", �� "),
	BI("��"),
	IF(", ���� "),
	AND(" � "),
	EVEN("����"),
	WHEN(", ����� "),
	STRAIGHT("�����"),
	AS("�����"),
	ANDNOW("� ������ ");
	
	
	private String value;
	InWords(String val) {
		this.value = val;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
}
