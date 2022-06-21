package Demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGparametersdemo {
@Test
@Parameters({"myname"})
	public void test (@Optional("hazim")String name) {
		System.out.println("name is : "+name);
		
	}
}
