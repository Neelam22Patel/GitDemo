package testNGPackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class NewTest {
 
	@Test(priority=2)
	public void f() {
			
		
  }
	@Test(priority=1,dependsOnMethods= {"f"},alwaysRun=true)
	public void b() {
		System.out.println("there is line on top");
		System.out.println("this is second line");
	}
}
