package places;

public class City extends Place implements IPointers{
	
	public City(String name) {
		super(name);
	}
	public String unnamed() {
		return "�����";
	}
	
	@Override
	public String cuda() {
		return "� " + name;
	}
	@Override
	public String gde() {
		return "� " + name + "�";
	}
	@Override
	public String kChemu() {
		return "� " + name + "�";
	}
}
