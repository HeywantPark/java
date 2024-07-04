package afternoon.exception.basic;

public class ExceptionWithout {
    public static void main(String[] args) {
        //예외 발생 시키기
        int[] arr = {1, 2, 3, 4, 5};
        int idx = 5;

        if(idx < arr.length) {
            System.out.println(arr[idx]);
        } else {
            System.out.println("니오나요?");
        }
    }
}
