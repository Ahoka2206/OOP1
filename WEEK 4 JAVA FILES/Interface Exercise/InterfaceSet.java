interface InterfaceSet{
	public static final int MAX = 10;
	public void add (int e);
	public void display();
	public int count ();
	public boolean isElementOf (int e);
	public int getElement(int index);
	public Set union (Set s);
	public Set intersection(Set s);
	public boolean isDisjoint(Set s);
	public Set difference(Set s);
	public boolean equal(Set s);
}