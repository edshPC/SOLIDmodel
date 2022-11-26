package places;

abstract public class Place implements IPointers {
	
	protected String name;
	
	public Place() {}
	public Place(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		if(name == null)
			return "место";
		return name;
	}
}
