package afternoon.exception.real;


import afternoon.exception.real.exceptions.MyCheckException;
import afternoon.exception.real.exceptions.MyUnCheckException;

public class Client {
    public void callException() {
        throw new MyCheckException("My check exception");
    }
    public void callException2() {
        throw new MyUnCheckException("My check exception");
    }

}
