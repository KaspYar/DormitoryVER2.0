package fabricMethod;

import model.Profile;
import model.Settler;

public class WorkerFactory extends ISettlerFactory{

	@Override
	public Settler getSettler() {
		// TODO Auto-generated method stub
		return new model.Worker();
	}

	@Override
	public Profile getProfile() {
		// TODO Auto-generated method stub
		return new model.ProfileWorker();
	}

}
