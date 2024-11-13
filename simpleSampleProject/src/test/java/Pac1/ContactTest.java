package Pac1;

import org.testng.annotations.Test;

public class ContactTest {
@Test(groups = "smokeTest")
public  void display() {
	String URL = System.getProperty("url");
	String BROWSER = System.getProperty("browser");
	String USERNAME = System.getProperty("username");
	String PASSWORD = System.getProperty("password");
	System.out.println(URL);
	System.out.println(USERNAME);
	System.out.println(BROWSER);
	System.out.println(PASSWORD);
	System.out.println("hello");
}
@Test(groups = "regressiontest")

public  void display1() {

System.out.println("hello");
}
}