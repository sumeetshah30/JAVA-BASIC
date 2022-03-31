 public class cylinder1con{
	private  int radius;
	private int height;
	
	public cylinder1con(int radius,int height) {
		this.radius = radius;	
		this.height = height;	
	}
	
	public int getradius() {
		return radius;	
	}
	public void setradius(int radius) {
		this.radius = radius;	
	}
	public int getheight() {
		return height;	
	}
	public void setheight(int height) {
		this.height = height;	
	}
	public double surfacearea() {
		return 2*Math.PI*radius*radius+2*3.142*radius*height;
	} 
	public double Volume() {
		return Math.PI*radius*radius*height;
	}
	public static void main(String[] args) {
		cylinder1con mycylinder = new cylinder1con(9,12);
		//mycylinder.setheight(12);
		int h= mycylinder.getheight();
		System.out.println("The height is : "+h);
		//mycylinder.setradius(9);
		System.out.println("The radius is : "+mycylinder.getradius());	
		System.out.println("The surface area of Cylinder is : "+mycylinder.surfacearea());	
		System.out.println("The Volume of Cylinder is : "+mycylinder.Volume());	

	}

}
