package things;

public class Need extends Thing {
	public Need() {
		super("необходимость");
	}
	
	public String be(String inWhat) {
		return this + " " + inWhat + " была";
	}
}
