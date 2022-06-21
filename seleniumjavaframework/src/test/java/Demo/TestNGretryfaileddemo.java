
package Demo;

import org.testng.annotations.Test;

public class TestNGretryfaileddemo {
	@Test
	public void test1() {
		System.out.println(" i am inside test1 ");
	}
	@Test
	public void test2() {
		System.out.println(" i am inside test2 ");
		//int i=1/0;
	}
	
	@Test(retryAnalyzer = listeners.Retryanalizer.class )
	public void test3() {
		System.out.println(" i am inside test3 ");
		int i=2/0;
	}
}
