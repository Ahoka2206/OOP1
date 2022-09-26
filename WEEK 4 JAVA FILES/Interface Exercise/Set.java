class Set implements InterfaceSet{
	private int [] set;
	private int count;

	public Set (){
		set = new int [MAX];
		count = 0;
	}

	public Set (int size){
		set = new int [size];
		count = 0;
	}

	public void add(int e){
		if(count < MAX){
			if(!isElementOf(e))
				set[count++] = e;
			}
	}

	public void display(){
		for(int i = 0; i < count; i++){
			System.out.println(set[i]);
		}
	}

	public int count(){
		 return count;
	}

	public boolean isElementOf(int e){
		for(int i = 0; i < count; i++){
			if(set[i] == e)
				return true;
		}
		return false;
	}

	public int getElement(int index){
		return set[index];
	}

	public Set union (Set s){
		Set union = new Set(100);

		for(int i = 0; i < this.count; i++){//first set
		union.set[union.count++] = this.set[i];
		}

		for(int i = 0; i < s.count; i++){//second set
			boolean ctr = union.isElementOf(s.set[i]); // repeated element
			if(ctr == false){
				for(int j = 0; j < union.count; j++){
					union.set[union.count] = s.set[i]; //adding the element in the union set
					union.count++;
					break;
				}
			}
		}

		count = s.count() + this.count();//update count
		return union;
	}

	public Set intersection(Set s){
		Set intersection = new Set(100);

		for(int j = 0; j < this.count; j++){
			if(s.isElementOf(this.set[j])){
				intersection.set[intersection.count] = this.set[j];
				intersection.count++;
			}
		}
		return intersection;
	}

	public boolean isDisjoint(Set s){
		for(int j = 0; j < this.count; j++){
			if(s.isElementOf(this.set[j])){
				return false;
			}
		}
		return true;
	}

	public Set difference(Set s){
		Set difference = new Set(100);

		for(int j = 0; j < this.count; j++){
			if(!s.isElementOf(this.set[j])){
				difference.set[difference.count] = this.set[j];
				difference.count++;
			}
		}
		return difference;
	}

	public boolean equal(Set s){
		for(int j = 0; j < this.count; j++){
			if(s.isElementOf(this.set[j])){
				return true;
			}
		}
		return false;
	}

}