package Nov16;

//
// Assignment 421 20%:
//© Your Name: Viviana Montoya Velez
//Written by: Viviana Montoya Velez, student id 2395170)
//


public class Computer {
	
	private static int numOfComputer = 0;
	private static long serialnumcounter = 100000;
	private static String equals =   
	
	private String brand;
	private String model;
	private long serialnum;
	private double price;


	
//constructor
	public Computer(String b,String m, double p) { 
		System.out.println("Creating the computer with parameter construtor");
		brand = b;
		model = m;
		price = p;
		serialnum = serialnumcounter;
		serialnumcounter++;		
		numOfComputer++;
	}
	
// (Hint: Accessors & Mutators.)	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String b) {
		brand = b;
}
	
	public String getModel() {
		return model;
	}
	public void setModel(String m) {
		model = m;
	
	}
	
	public long getSn() {
		return sn;
	}
	public void setSn(long s) {
		serialnum = s;
	}	
		public double getPrice() {
			return price;
		}
		public void setPrice(double p) {
			price = p;
		}

// Hint: toString() method ==> go to source + Generate toString()		
		@Override
		public String toString() {
			System.out.println("The brand of the computer is: " + brand);
			System.out.println("The model : " + model);
			System.out.println("The price is: " + price);
			System.out.println("The SN: " + serialnum);
			
			return "Computer [brand=" + brand + ", model=" + model + ", sn=" + serialnum + ", price=" + price + "]";
		}	
		
		public boolean equals(Computer c) {
			if(brand == c.brand && model == c.model && price == c.price ) {
				return true;
			}else {
				return false; 
			}
		}
}	

