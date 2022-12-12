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
		return this + " стал ворчать";
	}
	public String dontAttend(String what) {
		return this + " не обращал на " + what + " никакого внимания";
	}
	public String understand(String what) {
		return this + " так же ясно понимал, что " + what;
	}
	
	@Override
	public String thirdName() {
		return "он";
	}
	
	@Override
	public String toString() {
		if (name == null) {
			return "человек с пропеллером";
		}
		return name;
	}
}
