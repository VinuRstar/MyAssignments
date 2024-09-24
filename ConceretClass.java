package week3.day1;

public class ConceretClass implements DatabaseConnection {

	@Override
	public void connect() {
		
		System.out.println("Connect to link");
		
	}

	@Override
	public void disConnect() {
		
		System.out.println("Disconnect from link");
		
	}

	@Override
	public void executeUpdate() {
		
		System.out.println("Excute the Updated version");
		
	}
	
	public static void main(String[] args) {
		ConceretClass cc = new ConceretClass();
		cc.connect();
		cc.disConnect();
		cc.executeUpdate();
	

	}


}
