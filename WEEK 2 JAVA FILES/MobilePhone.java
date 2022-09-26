public class MobilePhone {
	private String brand;
	private String model;
	private String color;
	private double price;

	public MobilePhone(){}//first constructor

	public MobilePhone(String pbrand, String pmodel, String pcolor, double pprice ){//second constructor
		this.brand = pbrand;
		this.model = pmodel;
		this.color = pcolor;
		this.price = pprice;
	}

	public MobilePhone(String dcolor){//third constructor
		this.brand = "Apple";
		this.model = "iPhone XR";
		this.color = dcolor;
		this.price = 54250;
	}

	public void display(){
		System.out.println("Brand: "+ brand);
		System.out.println("Model: "+ model);
		System.out.println("Color: "+ color);
		System.out.printf("Price: %.1f\n", price);
	}

	public void updatePrice(double newPrice){
		 double finalprice;
		 finalprice= this.price + newPrice;
		 if(finalprice > 0){
		    this.price = finalprice;
        }
	}

	public static void main(String[] args){
		//MobilePhone phone = new MobilePhone("Samsung", "s10", "Black", 53300.00);
		MobilePhone phone = new MobilePhone();
		//phone.updatePrice(-12);
		//phone.display();
		//MobilePhone phone = new MobilePhone("yellow");
		phone.updatePrice(-12);
phone.display();
	}

}
