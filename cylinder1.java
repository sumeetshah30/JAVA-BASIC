 public class cylinder1{
	private  int radius;
	private int height;
	
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
		cylinder1 mycylinder = new cylinder1();
		mycylinder.setheight(12);
		int h= mycylinder.getheight();
		System.out.println("The height is : "+h);
		mycylinder.setradius(9);
		System.out.println("The radius is : "+mycylinder.getradius());	
		System.out.println("The surface area of Cylinder is : "+mycylinder.surfacearea());	
		System.out.println("The Volume of Cylinder is : "+mycylinder.Volume());	

	}

}
