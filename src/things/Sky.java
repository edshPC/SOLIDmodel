package things;

import enums.*;

public class Sky extends Thing {
	public Sky() {
		super("небо");
	}
	
	public String glow(boolean isGlow, String chem) {
		return (isGlow ? "":"не ") + "светится " + chem;
	}
	public String reflectWater(Adjectives adj) {
		String adjStr = adj.toString();
		return "отраженные в " + adjStr.substring(0, adjStr.length()-1) + "х водах залива";
	}
	public String seems(Adverbs adv, Adjectives adj) {
		String adjStr = adj.toString();
		return "кажутся " + adv + " " + adjStr.substring(0,adjStr.length()-1) + "ми";
	}
}
