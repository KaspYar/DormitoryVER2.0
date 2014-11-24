package fabricMethod;

import model.Profile;
import model.Settler;

public class GuestFactory extends ISettlerFactory{

	@Override
	public Settler getSettler() {
		// TODO Auto-generated method stub
		return new model.Guest();
	}

	@Override
	public Profile getProfile() {
		// TODO Auto-generated method stub
		return new model.ProfileGuest();
	}

}
