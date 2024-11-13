package Pac1;

import org.testng.annotations.Test;

public class ContactTest {
	
	
	@Test(groups = "Regression")

	public  void areg() {

	System.out.println("regression test case executed1");
	}
	
	
	
	@Test(groups = "Regression")

	public  void breg() {

	System.out.println("regression test case executed2");
	}
	
	
@Test(groups = "Smoke")
public  void asmoke() {
	String URL = System.getProperty("url");
	String BROWSER = System.getProperty("browser");
	String USERNAME = System.getProperty("username");
	String PASSWORD = System.getProperty("password");
	System.out.println(URL);
	System.out.println(USERNAME);
	System.out.println(BROWSER);
	System.out.println(PASSWORD);
	System.out.println("smoke test case executed1");
}

@Test(groups = "Smoke")
public  void bsmoke() {
	System.out.println("smoke test case executed2");
	
}

}