package places;

public class Roof extends Place implements IPointers{
	
	public Roof() {
		super("�����");
	}
	
	@Override
	public String cuda() {
		return "�� " + name.substring(0, name.length()-1) + "�";
	}
	@Override
	public String gde() {
		return "�� " + name.substring(0, name.length()-1) + "�";
	}
	@Override
	public String kChemu() {
		return "� " + name.substring(0, name.length()-1) + "�";
	}
}
