
public class employee {
	int id;
	int salary;
	String name;
	public void printdetails() {
		System.out.println("My id is: "+ id);
		System.out.println("My name is: "+ name);
	}

	public static void main(String[] args) {
		System.out.println("This is our Custom Class");
		employee sumeet = new employee();
		//Setting Attributes
		sumeet.id=15;
		sumeet.name="Sumeet Shah ";
		sumeet.salary=32;
		sumeet.printdetails();
		sumeet.printdetails();
  
		//Printing Attributes 
		//System.out.println(sumeet.id);
		//  System.out.println(sumeet.name);

	}

	public char[] setName() {
		// TODO Auto-generated method stub
		return null;
	}

}
