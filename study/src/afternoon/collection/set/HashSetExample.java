package afternoon.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        //데이터 추가
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);


        //중복된 데이터 추가 시도
        Boolean isAdded = set.add(30);
        System.out.println("30 추가 시도 결과 =" + isAdded);
        System.out.println(set);

        //데이터 검색
        boolean contains = set.contains(30);
        boolean contains2 = set.contains(40);

        System.out.println("30이 set에 존재하는가 = " + contains );
        System.out.println("40이 set에 존재하는가 = " + contains2);

        //데이터 삭제
        boolean isRemove = set.remove(30);
        System.out.println("20 삭제 시도 결과 " + isRemove);
        System.out.println(set);


    }
}
