package week1.day1;

public class Android 

{

	String deviceName = "galaxy Note5";
	
	
	boolean isAppstore= false;
	int traId = 12934567;
	float version = 8.5f;
	long deviceId = 1736459223;
	
	
	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		Android Sysfeature=new Android();
		
		
		long devID=Sysfeature.deviceId;
		System.out.println(devID);
		
		
		
		String devName=Sysfeature.deviceName;
		System.out.println(devName);
		
		boolean appstr=Sysfeature.isAppstore;
		System.out.println(appstr);
		
		float ver=Sysfeature.version;
		System.out.println(ver);
		
		
		int trid=Sysfeature.traId;
		System.out.println(trid);
		

	}
	
	
	

}
