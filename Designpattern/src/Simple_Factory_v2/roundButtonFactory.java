package Simple_Factory_v2;

public class roundButtonFactory implements ButtonFactoryInterface {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new RoundButton();
	}

}
