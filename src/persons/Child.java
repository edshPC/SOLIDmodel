package persons;

import enums.*;
import organs.*;

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
		return how + " забыл";
	}
	public String surprised(Adverbs how) {
		return how + " удивился";
	}
	public String usedTo(Actions act) {
		return "привык " + act;
	}
	public String afraidOf(boolean is, Adverbs how) {
		return how + (is ? "" : " не") + " боялся";
	}
	public String obhvat(Person whom, Organ chem, Organ chto) {
		String chtoStr = chto.toString();
		return ", обхватив " + whom + "а " + chem + "ми за " + chtoStr.substring(0, chtoStr.length()-1) + "ю";
	}
	public String flyUp(Adverbs how) {
		return how + " взлетал ввысь";
	}
	
	public Arm getArm() {
		return arm;
	}
	
	@Override
	public String thirdName() {
		return "он";
	}
	
	@Override
	public String toString() {
		if (name == null) {
			return "ребенок";
		}
		return name;
	}
}
