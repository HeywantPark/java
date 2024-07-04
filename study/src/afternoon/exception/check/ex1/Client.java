package afternoon.exception.check.ex1;

import java.util.Random;

public class Client {

    public void callRandException() throws MyCheckException2 {
        Random random = new Random();
        boolean rand = random.nextBoolean();

        if (rand) {
            throw new RuntimeException("오늘은 운이 없으시군요");
        }
        System.out.println("오늘은 운이 좋으시군요");
    }

}
