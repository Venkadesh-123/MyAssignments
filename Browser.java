package week1.day2;

public class Browser {

	public void launchBrowser(String BrowserName) {
	System.out.println("Browser launched successfully");
		

	}
	public void LoadUrl() {
		System.out.println("Application url loaded successfully");
		
	}
	
	public static void main(String[] args) {
		Browser a = new Browser();
		a.launchBrowser("safari");
		a.LoadUrl();
	}

}
