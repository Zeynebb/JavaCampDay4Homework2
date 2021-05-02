package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import mernisCheck.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		boolean result=false;
		try {
			result=client.TCKimlikNoDogrula(
						Long.valueOf(customer.getNationalityId()), 
						customer.getFirstName(), 
						customer.getLastName(), 
						customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;

	}

}
