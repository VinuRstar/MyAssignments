package week2.day4;

public class Edge extends Browser {

	public void takeSnap() {
		
		System.out.println("Snap shot succesfully taken");
	}
	
	public void clearCookies() {
		
		System.out.println("Cookies are cleared");
	}
	public static void main(String[] args) {
		
		Edge edg = new Edge();
		edg.openUrl();
		edg.takeSnap();
		edg.clearCookies();
		System.out.println(edg.name + " Edge");
		System.out.println(edg.version);
		edg.closeBrowser();

	}

}
