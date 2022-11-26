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
		String base = "разрешала " + act + " " + p.with();
		if(!isAllow)
			return "не " + base;
		return base;
	}
	
	@Override
	public String thirdName() {
		return "она";
	}
	
	@Override
	public String toString() {
		if (name == null) {
			return "мама";
		}
		return name;
	}
	
}
