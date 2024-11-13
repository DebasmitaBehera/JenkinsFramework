package Pac2;

import org.testng.annotations.Test;

public class OrgTest {
@Test(groups = "smokeTest")
public void dshow() {
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
	System.out.println("smoke test case executed2");
}
@Test(groups = "regressiontest")

public  void eshow1() {

System.out.println("regression test case executed2");
}
@Test(groups = "smokeTest")
public void fshow3() {
	System.out.println("smoke test case executed3");
}
}


