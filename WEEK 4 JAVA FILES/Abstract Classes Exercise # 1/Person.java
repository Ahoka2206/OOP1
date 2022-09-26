abstract class Person {
    private String name;
    private String address;
    private int age;

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

	public Person() {}

    //setters
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

    //getters
    public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

    public void display() {
        System.out.println("Name      : " + this.name);
		System.out.println("Address   : " + this.address);
		System.out.println("Age       : " + this.age);
    }

	//override
    public String toString() {
        return "Name: " + this.name + "\nAddress: " + this.address + "\nAge: " + this.age;
    }

    public boolean equals(final Object o) {
        if (o instanceof Person) {
            final Person person = (Person)o;
            if (this.getName() == person.getName() && this.getAddress() == person.getAddress() && this.getAge() == person.getAge()) {
                return true;
            }
        }
        return false;
    }
}