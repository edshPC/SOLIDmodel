package places;

import enums.Adjectives;

public class Sky extends Place
{
  public Sky() {
    super("небо");
  }
  

  public String glow(boolean isGlow, String chem) { return (isGlow ? "" : "не ") + "светится " + chem; }
  
  public String reflectWater(Adjectives adj) {
    String adjStr = adj.toString();
    return "отраженные в " + adjStr.substring(0, adjStr.length() - 1) + "х водах залива";
  }
  
  public String seems(enums.Adverbs adv, Adjectives adj) { String adjStr = adj.toString();
    return "кажутся " + adv + " " + adjStr.substring(0, adjStr.length() - 1) + "ми";
  }
  

  public String cuda()
  {
    return "на небо";
  }
  

  public String kChemu()
  {
    return "к небу";
  }
  

  public String gde()
  {
    return "на небе";
  }
}
