package test2;

public class KidsUsers implements LibraryUser {
	int age;
	String bookType;
		
		public void registerAccount() {
			if (age<12)
			{
				System.out.println("Sorry,age must be less than  12 to register as a kid");
			}
			
			
		}
		public void requestBook() {
			if(bookType=="Kids")
			{
				System.out.println("Books issued successfuly,please return the book within the 10 days");
				
			}
			else
			{
				System.out.println("oops your not allowed to take only kids books");
			}
		}
		/*public int getAge(){
		  return age;
		 }
		 
		 public void setAge(int age){
		 this.age = age;
		 }
		 
		 public String getBookType() {
		 return bookType;
		 }
		 
		 public void setBookType(String bookType) {
		 this.bookType = bookType;
		 }*/
		@Override
		public void requestbook() {
			// TODO Auto-generated method stub
			
		}
}	
		

		