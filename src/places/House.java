package places;

public class House extends Place implements IPointers {
	
	private Place where;
	public House(Place where) {
		super("�����");
		this.where = where;
	}
	
	public String whereIs() {
		return where.gde();
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
