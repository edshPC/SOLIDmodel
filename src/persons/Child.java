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
	public String goThrough(String cuda) {
		return this + " пробрался " + cuda;
	}
	public String understand(String what) {
		return this + " ясно понимал, что " + what;
	}
	public String enjoy(String what, Place where) {
		return this + " любовался " + what + " " + where.gde();
	}
	
	public Arm getArm() {
		return arm;
	}
	
	@Override
	public String thirdName() {
		return "он";
	}
	
	public class Bun extends Food {
		public Bun() {
			super("булочка", 10);
		}
		public String returnWith() {
			return "вернулся, нагруженный " + this + "ми";
		}
		public String oneAnother() {
			return "булочку-другую";
		}
		public String thisBunsNotSameThatAnother() {
			return "эти булочки совсем не похожи на другие булочки, которые печет мама " + Child.this + "а";
		}
	}
	
	@Override
	public String toString() {
		if (name == null) {
			return "ребенок";
		}
		return name;
	}
}
