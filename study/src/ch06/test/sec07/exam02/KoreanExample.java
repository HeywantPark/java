package ch06.test.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("박자바","011225-123456");
        System.out.println("k1.nation : " +k1.nation);
        System.out.println("k1.name : "+ k1.name);
        System.out.println("k1.SSN : "+ k1.ssn);

        System.out.println();


        Korean k2 = new Korean("김자바","930525-065432");
        System.out.println("k2.nation : " +k2.nation);
        System.out.println("k2.name : "+ k2.name);
        System.out.println("k2.SSN : "+ k2.ssn);

    }
}
