package organs;


abstract public class Organ {
	
	private int id;
	public Organ(int personId) {
		this.id = personId;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object o) {
		
		//Ќужно чтобы органы и их носители были одинаковыми
		if(o.getClass() != this.getClass())
			return false;
		
		Organ org = (Organ) o;
		return org.hashCode() == this.id;
	}
}
