package afternoon.operater;

public class Op2 {
    public static void main(String[] args) {
        // 문자열 비교
//        String str1 = "abc";
//        String str2 = "def";
//
//        boolean result1 = str1.equals("abc");
//        boolean result2 = "abc".equals(str2);
//        boolean result3 = str1.equals("def");
//
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);

        //문자 비교의 특이점
        System.out.println("abc" == "abc"); //abc는 값이 동일해서 기존 값을 참조함
        System.out.println("abc" == "def"); //def는 값이 달라서 새로운 인스턴스 생성
        System.out.println("abc" == new String("abc")); //new 연산자는 새로운 인스턴스를 생성

        int score = 90;
        boolean result = (score >= 80 && score <= 100);
        System.out.println(result);
   }
}