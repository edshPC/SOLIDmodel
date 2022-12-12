package places;

import enums.Adjectives;

public class Sky extends Place
{
  public Sky() {
    super("����");
  }
  

  public String glow(boolean isGlow, String chem) { return (isGlow ? "" : "�� ") + "�������� " + chem; }
  
  public String reflectWater(Adjectives adj) {
    String adjStr = adj.toString();
    return "���������� � " + adjStr.substring(0, adjStr.length() - 1) + "� ����� ������";
  }
  
  public String seems(enums.Adverbs adv, Adjectives adj) { String adjStr = adj.toString();
    return "������� " + adv + " " + adjStr.substring(0, adjStr.length() - 1) + "��";
  }
  

  public String cuda()
  {
    return "�� ����";
  }
  

  public String kChemu()
  {
    return "� ����";
  }
  

  public String gde()
  {
    return "�� ����";
  }
}
