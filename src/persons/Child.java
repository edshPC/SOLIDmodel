package persons;

import enums.*;
import organs.*;
import places.Place;
import things.Food;

public class Child extends Person {
	
	private Arm arm;
	{
		arm = new Arm(this.getId());
	}
	public Child() {
		super();
	}
	public Child(String name) {
		super(name);
	}
	
	public String forgot(Adverbs how) {
		return how + " �����";
	}
	public String surprised(Adverbs how) {
		return how + " ��������";
	}
	public String usedTo(Actions act) {
		return "������ " + act;
	}
	public String afraidOf(boolean is, Adverbs how) {
		return how + (is ? "" : " ��") + " ������";
	}
	public String obhvat(Person whom, Organ chem, Organ chto) {
		String chtoStr = chto.toString();
		return ", �������� " + whom + "� " + chem + "�� �� " + chtoStr.substring(0, chtoStr.length()-1) + "�";
	}
	public String flyUp(Adverbs how) {
		return how + " ������� �����";
	}
	public String goThrough(String cuda) {
		return this + " ��������� " + cuda;
	}
	public String understand(String what) {
		return this + " ���� �������, ��� " + what;
	}
	public String enjoy(String what, Place where) {
		return this + " ��������� " + what + " " + where.gde();
	}
	
	public Arm getArm() {
		return arm;
	}
	
	@Override
	public String thirdName() {
		return "��";
	}
	
	public class Bun extends Food {
		public Bun() {
			super("�������", 10);
		}
		public String returnWith() {
			return "��������, ����������� " + this + "��";
		}
		public String oneAnother() {
			return "�������-������";
		}
		public String thisBunsNotSameThatAnother() {
			return "��� ������� ������ �� ������ �� ������ �������, ������� ����� ���� " + Child.this + "�";
		}
	}
	
	@Override
	public String toString() {
		if (name == null) {
			return "�������";
		}
		return name;
	}
}
