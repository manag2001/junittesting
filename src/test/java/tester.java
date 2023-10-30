import  org.junit.*;
public class tester {
    @Test
    public void test_factorial1() {
        Junit_class obj = new Junit_class();
        assert(obj.factorial(1) == 1);

    }

    public void test_factorial0() {
        Junit_class obj = new Junit_class();
        assert (obj.factorial(0) == 1);

    }
    public void test_factorial5() {
        Junit_class obj = new Junit_class();
        assert (obj.factorial(5) == 120);

    }

    public void test_fibbonaci() {
        Junit_class obj = new Junit_class();
        assert (obj.fibonacci(3) == 2);

    }
    public void test_fibbonaci0() {
        Junit_class obj = new Junit_class();
        assert (obj.fibonacci(0) == 0);

    }
    public void test_fibbonaci_minus1() {
        Junit_class obj = new Junit_class();
        assert (obj.fibonacci(-1) == 1);

    }
    public void isprimetester3() {
        Junit_class obj = new Junit_class();
        assert (obj.isPrime(3) == true);

    }
}






