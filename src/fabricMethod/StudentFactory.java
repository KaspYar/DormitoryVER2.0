package fabricMethod;

import model.Profile;
import model.Settler;

public class StudentFactory extends ISettlerFactory{

	@Override
	public Settler getSettler() {
		// TODO Auto-generated method stub
		return new model.Student();
	}

	@Override
	public Profile getProfile() {
		// TODO Auto-generated method stub
		return new model.ProfileStudent();
	}

}
