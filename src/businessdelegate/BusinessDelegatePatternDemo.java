package businessdelegate;

public class BusinessDelegatePatternDemo {

	public static void main(String[] args) {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType(BusinessLookup.EJB);
		
		Client client = new Client(businessDelegate);
		client.doTask();
		
		businessDelegate.setServiceType(BusinessLookup.JMS);
		client.doTask();
	}

}
