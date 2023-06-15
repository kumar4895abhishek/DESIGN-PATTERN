package builder_v1;

public class Student 
{
	
	int age;
	
	public String firstName;
	
	public String lastName;
	
	String email;
	
	boolean active;
	
	public String getFirstName() {
        return this.firstName;
    }
	
	public String getLastName() {
		// TODO Auto-generated method stub
		return this.lastName;
	}

   
	
	
	private Student() {};
	
	
	public static Builder buil()
	{
		return new Builder();
	}
	
	 public static class Builder
	{
		private int age;
		
		private String firstName;
		
		private String lastName;
		
		private String email;
		
		private boolean active;
		
		public int getAge() {
			return this.age;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public String getFirstName() {
			return this.firstName;
		}

		public Builder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public String getLastName() {
			return this.lastName;
		}

		public Builder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public String getEmail() {
			return this.email;
		}

		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}

		public boolean isActive() {
			return this.active;
		}

		public Builder setActive(boolean active) {
			this.active = active;
			return this;
		}

		
		
		public Student build()
		{
			Student student =new Student();
			student.firstName=this.firstName;
			student.lastName=this.lastName;
			student.age=this.age;
			student.email=this.email;
			student.active=this.active;
			
			
			return student;
			
		}
		
		
	}

	

	

}
