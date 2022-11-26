package persons;

public class Somebody extends Person {
	
	public Somebody() {
		super();
	}
	public Somebody(String name) {
		super(name);
	}
	public String remind(String whom, String about) {
		return whom + " " + about + " ��������";
	}
	
	@Override
	public String thirdName() {
		return "��(�)";
	}
	
	@Override
	public String toString() {
		if (name == null) {
			return "���-������";
		}
		return name;
	}
}
