package week2.day4;

public class Chrome extends Browser {
	
	
	public void openIncognito() {
		
		System.out.println("Incognito mode is on");
	}
	
	public void clearCache() {
		
		System.out.println("Cache is cleared");
	}

	public static void main(String[] args) {
		Chrome cr = new Chrome();
		cr.openUrl();
		cr.openIncognito();
		cr.clearCache();
		System.out.println(cr.name + "Chrome");
		System.out.println(cr.version);
		cr.closeBrowser();

	}

}
