package Maven.Lab06;

import static org.junit.Assert.*;
import junit.framework.Test;

public class Test_Calculator {
	Calculator c = new Calculator();
	public void test() {
		if(5==c.add(3,2))
			assert(true);
		else
			assert(false);
		//assertEquals(6,c.add(3, 2));
		//fail("Not yet implemented");
	}
}
