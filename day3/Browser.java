package week1.day3;

public class Browser {
	
	
public String launchBrowser() {
	
	return "Browser Launched Successfully";
	
}

public String loadUrl() {
	
	return "Application url loaded successfully";
}


	public static void main(String[] args) {

		Browser output = new Browser();
		System.out.println(output.launchBrowser());
		System.out.println(output.loadUrl());
		
	}

}
