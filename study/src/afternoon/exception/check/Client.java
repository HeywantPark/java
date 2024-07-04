package afternoon.exception.check;

public class Client {
    public void callException() throws MyCheckException {
        throw new MyCheckException("client.all 에서 에러 발생");
    }
}
