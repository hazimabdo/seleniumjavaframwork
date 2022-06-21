package listeners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.SkipException;
import org.testng.annotations.Listeners;


public class TestNGlistenersdemo2 {
    
	@Test
	public void test4() {
		System.out.println("i am inside test4");
	}
    
	@Test
	public void test5() {
		System.out.println("i am inside test5");
		
		
	
	}
	@Test
	public void test6() {
		System.out.println("i am inside test6");
		throw new SkipException("this test is skipped");
	}
}
