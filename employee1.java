  
 class employee1 {
	  int salary;
	  String name;
		public int getsalary() {
			return salary;
		}
		public String getName() {
			return name;
		}
		public void setName(String n) {
			name = n;
		}
	
	public static void main(String[] args) {
		employee1 sumeet = new employee1();
		sumeet.setName("Sumeet Shah");
		sumeet.salary = 23000;
		System.out.println(sumeet.getsalary());
		System.out.println(sumeet.getName());
	}

}
