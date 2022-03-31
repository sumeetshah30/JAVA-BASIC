class cylinder{
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
	public static void main(String[] args) {
		cylinder mycylinder = new cylinder();
		mycylinder.setheight(12);
		int h= mycylinder.getheight();
		System.out.println(h);
		mycylinder.setradius(9);
		System.out.println(mycylinder.getradius());	
	}

}
