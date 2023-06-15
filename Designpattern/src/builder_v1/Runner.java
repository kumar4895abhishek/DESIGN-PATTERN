package builder_v1;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student builder=Student.buil()
				.setFirstName("Abhishek")
				.setLastName("Kumar")
				.setEmail("Kumar")
				.setAge(20)
				.setActive(false)
				.build();
		
		System.out.println("First Name: "+builder.getFirstName()+" Last Name: "+ builder.getLastName());

	}

}
