

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Test_cal {
	
    double aug1 = 25.2586;
    double aug2 = 6.1602;

    


	@Test
	void testadd() {
        cal c = new cal();
        System.out.println("Running test add: ");
        c.add(aug1, aug2);
        Assertions.assertEquals(aug1 + aug2, c.getResult(), 0.00);
    }
	@Test
	void testsubstract() {
        cal c = new cal();
        System.out.println("Running test subtract: ");
        c.subtract(aug1, aug2);
        Assertions.assertEquals(aug1 - aug2, c.getResult(), 0.00);
    }
	@Test
	void testmultiply() {
        cal c = new cal();
        System.out.println("Running test multiply: ");
        c.multiply(aug1, aug2);
        Assertions.assertEquals(aug1 * aug2, c.getResult(), 0.00);
    }
	@Test
	void testdivide() {
        cal c = new cal();
        System.out.println("Running test divide: ");
        c.divide(aug1, aug2);
        Assertions.assertEquals(aug1 / aug2, c.getResult(), 0.00);
    }
	@Test
	void testexponent() {
        cal c = new cal();
        System.out.println("Running test exponent: ");
        c.exponent(aug1, aug2);
        Assertions.assertEquals(Math.pow(aug1, aug2), c.getResult(), 0.00);
    }

}
