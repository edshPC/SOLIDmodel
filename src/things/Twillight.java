package things;

import enums.*;

public class Twillight extends Thing {
	public Twillight() {
		super("сумерки");
	}
	
	public String be(boolean isBe, Adverbs adv, Adjectives... adjs) {
		String signs = "";
		for(Adjectives adj : adjs) {
			String adjStr = adj.toString();
			signs += adv + " " + adjStr.substring(0, adjStr.length()-1) + "ми, ";
		}
		return (isBe ? "":"не ") + "бывают " + signs;
	}
}
