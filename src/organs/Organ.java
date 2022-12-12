package organs;

import persons.IEqualChecker;

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
		IEqualChecker checker = new IEqualChecker() {
			private int id1;
			private int id2;
			{
				this.id1 = Organ.this.id;
				this.id2 = org.hashCode();
			}
			@Override
			public boolean checkIds() {
				// TODO Auto-generated method stub
				return id1==id2;
			}
		};
		return checker.checkIds();
	}
}
