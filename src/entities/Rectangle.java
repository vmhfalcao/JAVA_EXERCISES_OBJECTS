package entities;

public class Rectangle {
	
	public double width;
	public double hight;
	
	
	public double Area() {
		return this.width * this.hight;
		
	}
	
	public double  Perimeter() {
		return (this.width * 2) + (this.hight * 2);
		
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(this.width , 2) + Math.pow(this.hight , 2));	
		
	}
	
	public String toString() {
		return "AREA = "
				+ String.format("%.2f", Area())
				+ "\nPERIMETER = "
				+ String.format("%.2f", Perimeter())
				+ "\nDIAGONAL = "
				+ String.format("%.2f", Diagonal());
				
		
	}

}
