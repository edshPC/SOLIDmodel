package things;

import enums.*;

public class Twillight extends Thing {
	public Twillight() {
		super("�������");
	}
	
	public String be(boolean isBe, Adverbs adv, Adjectives... adjs) {
		String signs = "";
		for(Adjectives adj : adjs) {
			String adjStr = adj.toString();
			signs += adv + " " + adjStr.substring(0, adjStr.length()-1) + "��, ";
		}
		return (isBe ? "":"�� ") + "������ " + signs;
	}
}
