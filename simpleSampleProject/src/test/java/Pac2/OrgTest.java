package Pac2;

import org.testng.annotations.Test;

public class OrgTest {
@Test(groups = "smokeTest")
public void show() {
	String URL = System.getProperty("url");
	String BROWSER = System.getProperty("browser");
	String USERNAME = System.getProperty("username");
	String PASSWORD = System.getProperty("password");
	System.out.println(URL);
	System.out.println(USERNAME);
	System.out.println(BROWSER);
	System.out.println(PASSWORD);
	
	System.out.println("hi");
	System.out.println("Hello");
	System.out.println("Hello2");
}
@Test(groups = "regressiontest")

public  void show1() {

System.out.println("hello2");
}
}
