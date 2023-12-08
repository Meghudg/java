package encapsulation;

public class Employee {

		public String name;
		private int eid;
		protected String dptname;
		String location;
		public int getempid() {
			return eid;
		}
		public void setempid(int empid) {
			this.eid = eid;
		}
		protected void display()
		{
			System.out.println("Inside protected method");
		}
}	
		
		
		
		
		

	


