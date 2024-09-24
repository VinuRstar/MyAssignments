package week3.day1;

public class APIClient {
	
	
	public void sendRequest(String endpoint ) {
		
		System.out.println(endpoint);
		
	}
	
	public void sendRequest(String endpoint1,String requestbody,boolean requestparameter ) {
		
		System.out.println(endpoint1 + requestbody + true);
	}

	public static void main(String[] args) {
		
		APIClient sr = new APIClient();
		sr.sendRequest("sendRequest of String endpoint");
		sr.sendRequest("sendRequest of String endpoint1", " sendRequest of String requestbody", true);

	}

}
