package Pac1;

import org.testng.annotations.Test;

public class ContactTest {
@Test(groups = "smokeTest")
public  void adisplay() {
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
@Test(groups = "regressiontest")

public  void bdisplay1() {

System.out.println("regression test case executed1");
}
@Test(groups = "smokeTest")
public  void cdisplay3() {
	System.out.println("smoke test case executed4");
	
}

}