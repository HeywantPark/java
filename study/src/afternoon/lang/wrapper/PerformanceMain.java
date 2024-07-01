package afternoon.lang.wrapper;

public class PerformanceMain {
    public static void main(String[] args) {
        int max = 1_000_000_000;
        long startTime, endTime;

        long sum1 = 0;
        startTime = System.currentTimeMillis();
         for (int i = 0; i < max; i++) {
             sum1 += i;
         }
         endTime = System.currentTimeMillis();
        System.out.println("sum = " + sum1);
        System.out.println("기본 자료형 연산에 걸린 시간 : " + (endTime - startTime) + "ms");

        //wrapper 클래스 사용
        Long sum2 = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            sum2 += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sum2 = " + sum2);
        System.out.println("Wrapper 클래스 연산에 걸린 시간 : " + (endTime - startTime) + "ms");

    }

}
