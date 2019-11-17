
import org.junit.Assert;
import org.junit.Test;

public class FibonacciTests {

    @Test
    public void fibonacciTestpass(){
        Fibonacci fibo = new Fibonacci();
        int s = fibo.fib(5);
        Assert.assertEquals(s, 4);
    }


}
