package persons;

import organs.Neck;

public class Carlson extends Person {

	private Neck neck;
	{
		neck = new Neck(this.getId());
	}
	public Carlson() {
		super();
	}
	public Carlson(String name) {
		super(name);
	}
	
	public Neck getNeck() {
		return neck;
	}
	public String startVorch() {
		return this + " ���� �������";
	}
	public String dontAttend(String what) {
		return this + " �� ������� �� " + what + " �������� ��������";
	}
	public String understand(String what) {
		return this + " ��� �� ���� �������, ��� " + what;
	}
	
	@Override
	public String thirdName() {
		return "��";
	}
	
	@Override
	public String toString() {
		if (name == null) {
			return "������� � �����������";
		}
		return name;
	}
}
