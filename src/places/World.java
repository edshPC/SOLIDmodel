package places;

public class World extends Place {
	
	public World() {
		super("���");
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
