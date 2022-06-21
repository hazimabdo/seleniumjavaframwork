package Demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	@Test
	public void one() {
		System.out.println("i am inside test1");
		
	}
	
	@Test(priority =1)
public void two() {
		System.out.println("i am inside test2");
	
}

	@Test(priority =1)
public void three() {
		System.out.println("i am inside test3");
	
}

}
