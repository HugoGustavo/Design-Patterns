package businessdelegate;

public class BusinessDelegate {
	private BusinessLookup lookupService = new BusinessLookup();
	private BusinessService businessService;
	private int serviceType;
	
	public void setServiceType(int serviceType) {
		this.serviceType = serviceType;
	}
	
	public void doTask() {
		businessService = lookupService.getBusinessService(serviceType);
		businessService.doProcessing();
	}
}
