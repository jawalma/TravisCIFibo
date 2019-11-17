
import org.junit.Assert;
import org.junit.Test;

public class FibonacciTests {

    @Test
    public void fibonacciTestFail(){
        Fibonacci fibo = new Fibonacci();
        int s = fibo.fib(5);
        Assert.assertEquals(s, 4);
    }

    @Test
    public void failingatlife(){
        Assert.assertTrue(false);
    }

}
