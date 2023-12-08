package encapsulation;

public class Empmain {

	public static void main(String[] args) {
	 Employee e1 = new Employee();
	 e1.name = "Sanjana";
	 e1.dptname = "IT";
	 e1.location = "Delhi";
	 e1.setempid(1204);
	 e1.getempid();
	 
	 System.out.println("Employee Name is" + e1.name);
	 System.out.println("Employee Department is" + e1.dptname);
	 System.out.println("Employee location is" + e1.location);
	 System.out.println("Employee Id is" + e1.getempid());
	}

}
