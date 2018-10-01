package businessdelegate;

public class BusinessLookup {
	public static final int EJB = 0;
	public static final int JMS = 1;
	
	public BusinessService getBusinessService(int type) {
		switch ( type ) {
			case EJB: return new EJBService();
			case JMS: return new JMSService();
			default : throw new IllegalArgumentException("Serivce don't exists");
		}
	}
}
