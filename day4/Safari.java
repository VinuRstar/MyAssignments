package week2.day4;

public class Safari extends Browser {
	
	public void readerMode() {
		
		System.out.println("Reader mode is on");
	}
	
	public void fullScreenMode() {
		
		System.out.println("Full Screen mode is on");
	}

	public static void main(String[] args) {
		
		Safari sfr = new Safari();
		sfr.openUrl();
		sfr.readerMode();
		sfr.fullScreenMode();
		System.out.println(sfr.name + " Safari");
		System.out.println(sfr.version);
		sfr.closeBrowser();

	}

}
