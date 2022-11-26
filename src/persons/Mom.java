package persons;

import enums.Actions;
import organs.IAllowing;

public class Mom extends Person implements IAllowing {

	public Mom() {
		super();
	}
	public Mom(String name) {
		super(name);
	}
	
	@Override
	public String isAllowing(boolean isAllow, Actions act, Person p) {
		String base = "��������� " + act + " " + p.with();
		if(!isAllow)
			return "�� " + base;
		return base;
	}
	
	@Override
	public String thirdName() {
		return "���";
	}
	
	@Override
	public String toString() {
		if (name == null) {
			return "����";
		}
		return name;
	}
	
}
