package hooks;

import io.cucumber.java.*;

public class MyHooks {
	
	@Before
	public void setup(Scenario scenario) {
		
		System.out.println("Execution started for the scenario" +scenario.getName());
		System.out.println("Browser Launched and maximized");
		System.out.println("Application URL got opened");
	}
	
	@After
	public void tearDown(Scenario scenario) {
		
		System.out.println("Logged out from the application");
		System.out.println("Browser got closed");
		System.out.println("Execution ended for the scenario" +scenario.getName());
	}	

}
