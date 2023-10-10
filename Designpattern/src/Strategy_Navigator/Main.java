package Strategy_Navigator;

public class Main {

	public static void main(String[] args) {
		
		//Navigator navigator=new Navigator(new CarDrivingStrategy());
		Navigator navigator=new Navigator(new WalkingStrategy());

		navigator.navigate("BANGALORE", "PUNE");

	}

}
