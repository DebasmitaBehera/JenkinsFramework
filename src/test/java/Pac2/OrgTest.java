package Pac2;

import org.testng.annotations.Test;

public class OrgTest {
@Test(groups = "smokeTest")
public void csmoke() {
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
	System.out.println("smoke test case executed3");
}
@Test(groups = "regressiontest")

public  void creg() {

System.out.println("regression test case executed3");
}
@Test(groups = "smokeTest")
public void dsmoke() {
	System.out.println("smoke test case executed4");
}
}


