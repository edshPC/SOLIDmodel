package things;

import enums.*;

public class Sky extends Thing {
	public Sky() {
		super("����");
	}
	
	public String glow(boolean isGlow, String chem) {
		return (isGlow ? "":"�� ") + "�������� " + chem;
	}
	public String reflectWater(Adjectives adj) {
		String adjStr = adj.toString();
		return "���������� � " + adjStr.substring(0, adjStr.length()-1) + "� ����� ������";
	}
	public String seems(Adverbs adv, Adjectives adj) {
		String adjStr = adj.toString();
		return "������� " + adv + " " + adjStr.substring(0,adjStr.length()-1) + "��";
	}
}
