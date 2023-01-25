package Utilities;

public class CommonMethods {
	
	public facebookLogin facebook = null

	@BeforeClass(alwaysRun=true)
	@Parameters({"browser", "app"})
	public void setUp(String name, String url) {
		
		selectBrowser(name);
		initApplication(url);
		
	}
	
	public 
}
