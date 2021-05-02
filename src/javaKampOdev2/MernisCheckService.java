package javaKampOdev2;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisCheckService implements CustomerCheckService{
	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
