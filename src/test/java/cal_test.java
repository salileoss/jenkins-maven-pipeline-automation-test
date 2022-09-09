import org.junit.Assert;
import org.junit.Test;

public class cal_test {

    double aug1 = 25.2586;
    double aug2 = 6.1602;

    @Test
    public void testadd() {
        cal c = new cal();
        c.add(aug1, aug2);
        Assert.assertEquals(aug1 + aug2, c.getResult(), 0.00);
    }

    @Test
    public void testsubstract() {
        cal c = new cal();
        c.subtract(aug1, aug2);
        Assert.assertEquals(aug1 - aug2, c.getResult(), 0.00);
    }

    @Test
    public void testmultiply() {
        cal c = new cal();
        c.multiply(aug1, aug2);
        Assert.assertEquals(aug1 * aug2, c.getResult(), 0.00);
    }

    @Test
    public void testdivide() {
        cal c = new cal();
        c.divide(aug1, aug2);
        Assert.assertEquals(aug1 / aug2, c.getResult(), 0.00);
    }

    @Test
    public void testexponent() {
        cal c = new cal();
        c.exponent(aug1, aug2);
        Assert.assertEquals(Math.pow(aug1, aug2), c.getResult(), 0.00);
    }
}
